import axios from 'axios';
import React, { Component } from 'react'
//import './Profile.css'
export default class Profile extends Component {

  state={
    data:[]
}
componentDidMount()
{
  const {mail}= this.props;
 //const mail= '727721euee012@skcet.ac.in';
 // alert(`The mail: ${mail}`);

  axios.get(`http://localhost:8082/getbyMail/${mail}`)
  .then(response => {
      this.setState({data: response.data});
     // alert(`The pass: ${response.data}`);
  })

  .catch(error =>{
      console.log(error);
  });
}
  render() {
    const {mail}= this.props;

    const typeStyle = {
      height: '40px',
      width: '265px',
      borderRadius: '10px',
      fontSize: '21px',
      fontFamily: 'Franklin Gothic Medium, Arial Narrow, Arial, sans-serif'
    };

    const labelStyle={
      fontSize: '30px', fontFamily: 'cursive', paddingLeft: '50px', paddingRight: '30px'
    }

    const headingStyle={paddingTop: '30px', paddingBottom: '30px', fontSize: '40px', fontFamily: 'Gill Sans, Gill Sans MT, Calibri, Trebuchet MS, sans-serif'}
   
    const goHome={position: 'absolute', transform: 'translate(1300px,20px)', backgroundColor: 'white', color: 'black', border: 'none', fontSize: '35px', cursor: 'pointer', fontFamily: 'Gill Sans, Gill Sans MT, Calibri, Trebuchet MS, sans-serif'}
    
    const box3={color: 'white', backgroundColor: 'black', height: '765px', width:'1520px', marginTop: '-10px', marginLeft: '-10px'}
    
    // const mail= '727721euee012@skcet.ac.in';
    return (
      <div style={box3}>
      <a href='/'><button style={goHome} >Home</button></a>
      <h1 id='mp'>My Profile</h1>
      <h2 class="heading" style={headingStyle}>User Info</h2>
      <form>
      <label class="label1" style={labelStyle}>User ID</label>
      <input type='text' class="type" value={this.state.data.userId} style={typeStyle}/>
      <br/><br/><br/><br/>
      <label class="label1" style={labelStyle}>User Name</label>
      <input type='text' class="type" value={this.state.data.name} style={typeStyle}/>
      <label class="label1" style={labelStyle}>E-Mail Address</label>
      <input type='text' class="type" value={mail} style={typeStyle}/>
      </form>
      <h2 class="heading" style={headingStyle}>User's other details:</h2>
      <form>
      <label class="label1" style={labelStyle}>Age</label>
      <input type='number' class="type" value={this.state.data.age} style={typeStyle}/>
      <br/><br/><br/>
      <label class="label1" style={labelStyle}>Mobile Number</label>
      <input type='number' class="type" value={this.state.data.mobileNo} style={typeStyle}/>
      <label class="label1" style={labelStyle}>Aadhar Number</label>
      <input type='number' class="type" value={this.state.data.aadharNo} style={typeStyle}/>
      </form>
      </div>
    )
  }
}

