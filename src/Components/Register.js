import axios from "axios";
import React, { Component } from "react";

export default class Register extends Component
{
    constructor(props)
    {
        super(props);
        this.state={
         //   userId:'',
            name: '',
            age: '',
            mobileNo: '',
            aadharNo: '',
            mail_id: '',
            password: '',
        }
    }

    handleSubmit= (e)=>{
        e.preventDefault();

        if (this.state.password !== this.state.confirmPassword) {
            alert('Passwords does not match!');
            return;
        }
        
        const data={
          //  userId: this.state.userId,
            name: this.state.name,
            age: this.state.age,
            mobileNo: this.state.mobileNo,
            aadharNo: this.state.aadharNo,
            le:{
                mail_id: this.state.mail_id,
                password: this.state.password,
            },
        };
        axios.post('http://localhost:8082/userpost',data)

        alert('Your account has been created successfuly!')
    };

    
    render()
    {
    return(
        <div id="box1">
        <div id="head1">
        <h1>User Registration</h1>
        <img id="regi" src="https://cdn-icons-png.flaticon.com/512/72/72648.png" alt="regi"/>
        </div>

        <form id="text1" onSubmit={this.handleSubmit}>
        <br/>

       
        <label>UserName</label>
        <input type="text" id="uname" class="field1" value={this.state.name} onChange={(e)=>{this.setState({name:e.target.value})}}/>
        <br/><br/>

        <label>Age</label>
        <input type="number" id="age" class="field1" value={this.state.age} onChange={(e)=>{this.setState({age:e.target.value})}}/>
        <br/><br/>

        <label>Mobile Number</label>
        <input type="text" id="preset" value="+91" class="field1"/>
        <input type="number" id="num" class="field1" value={this.state.mobileNo} onChange={(e)=>{this.setState({mobileNo:e.target.value})}}/>
        <br/><br/>

        <label>Aadhar Number</label>
        <input type="number" id="aad" class="field1" value={this.state.aadharNo} onChange={(e)=>{this.setState({aadharNo:e.target.value})}}/>
        <br/><br/>

        <label>E-mail address</label>
        <input type="text" id="mail" class="field1" value={this.state.mail_id} onChange={(e)=>{this.setState({mail_id:e.target.value})}}/>
        <br/><br/>

        <label>Password</label>
        <input type="password" id="upass" class="field1" value={this.state.password} onChange={(e)=>{this.setState({password:e.target.value})}}/>
        <br/><br/>

        <label>Confirm Password</label>
        <input type="password" id="cpass" class="field1" value={this.state.confirmPassword} onChange={(e)=>{this.setState({confirmPassword:e.target.value})}}/>
        <br/><br/>
        <button type="submit" id="reg">Submit!</button>
        </form>

        <a id="rlink" href="/log">Already an User! Click to Login</a>
        </div>
    )
    }
}

// <label>User ID</label>
// <input type="number" id="uid" class="field1" value={this.state.userId} onChange={(e)=>{this.setState({userId:e.target.value})}}/>
// <br/><br/>
