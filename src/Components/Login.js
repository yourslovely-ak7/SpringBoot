import axios from 'axios';
import React, { Component } from 'react'
import ReactDOM from 'react-dom';
//import Profile from './Profile';
import { Link } from 'react-router-dom';

export default class Login extends Component {

    constructor(props)
    {
        super(props);
        this.state={
            mail_id:'',
            password:'',
            data:[],
            showprofile: false
        }
    }  

    handleSubmit= (e)=>
    {
        e.preventDefault();

        const email= this.state.mail_id;
        axios.get(`http://localhost:8082/getpass/${email}`)
        .then(response => {
            this.setState({data: response.data});

            if (response.data.password === this.state.password) {
                alert('Your account has been logged in successfully.');

                // Open a new window with the Profile component
                const newWindow = window.open('', '_blank');
                newWindow.document.write('<html><head><title>Profile</title></head><body>');
             //   newWindow.document.write('<link rel="stylesheet" type="text/css" href="./path/to/Profile.css">');
                newWindow.document.write('<div id="root"></div>');
                newWindow.document.write('</body></html>');
                newWindow.document.getElementById('root').innerHTML = '<h1>Loading Profile...</h1>';

                // Load your Profile component into the new window
                import('./Profile').then((module) => {
                    const ProfileComponent = module.default;
                    ReactDOM.render(<ProfileComponent mail={this.state.mail_id} />, newWindow.document.getElementById('root'));
                });

                this.setState({showprofile: true})
                //this.props.history.push(`/profile/${this.state.mail_id}`);
            }
            else
            {
                alert('Please enter a valid E-mail and Password!')
            }
        })
      
        .catch(error =>{
            console.log(error);
        });

       // alert(`The password : ${this.state.data.password} : ${this.state.mail_id}`);
    }

  render() {
    return(
        <div id="box">
        <a href="/"><img  alt='' src="https://pixsector.com/cache/1788ac30/ave36c6a1e9d5a19e29c4.png" id="hir"/></a>
        <div id="head">
        <h1>USER LOGIN</h1>
        <img id="user" src="https://upload.wikimedia.org/wikipedia/commons/9/99/Sample_User_Icon.png" alt="login"/>
        </div>
        <br/><br/>
        <form id="text" onSubmit={this.handleSubmit}>
        <label>E-mail address</label>
        <br/>
        <input class="field" id="email" placeholder="Enter your E-mail here" type="text" value={this.state.mail_id} onChange={(e)=>{this.setState({mail_id:e.target.value})}}></input>
        <br/><br/>
        <label>Password</label>
        <br/>
        <input class="field" id="pass" placeholder="Enter your ********" type="password" value={this.state.password} onChange={(e)=>{this.setState({password:e.target.value})}}></input>
        <br/><br/>
        <button type="submit" id="sub">Log In</button>
        </form>
        <Link id="rlink" to="/reg">New User! Click HERE to Register</Link>
        </div>
    )
  }
}
