import React, { Component } from 'react'
import axios from 'axios';

export default class ShowTable extends Component {
    state={
        data:[]
    }
    componentDidMount()
    {
      axios.get('http://localhost:8082/userget')
      .then(response => {
          this.setState({data: response.data});
      })

      .catch(error =>{
          console.log(error);
      });
    }

  render() {
    return (
      <div>
      <h1>PROFILE</h1>
      <table border={1}>
      <thead>
      <tr>
      <th>User ID</th>
      <th>User Name</th>
      <th>Age</th>
      <th>Mobile Number</th>
      <th>Aadhar Number</th>
      <th>E-mail ID</th>
      </tr>
      </thead>
      <tbody>
      {
        this.state.data.map(user=>(
            <tr key={user.userId}>
            <td>{user.userId}</td>
            <td>{user.name}</td>
            <td>{user.age}</td>
            <td>{user.mobileNo}</td>
            <td>{user.aadharNo}</td>
            <td>{user.le.mail_id}</td>
            </tr>
        ))
      }
      </tbody>
      </table>
      </div>
    )
  }
}