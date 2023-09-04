import React, { Component } from 'react'
import axios from 'axios';

export default class ShowUser extends Component {
    state={
        data:[]
    }

    componentDidMount()
    {
      const {id}=this.props;
      //console.log('Fetching data for id:', id);
      //const id='1';
      axios.get(`http://localhost:8082/hotgetbyid/${id}`)
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
      <div id='data'>
      <h1 id='hn' >{this.state.data.hotelName}</h1>
      <div id='det'>
      <h2>Hotel ID : {this.state.data.hotelId}</h2>
      <h2>Address : {this.state.data.address}</h2>
      <h2>City : {this.state.data.city}</h2>
      <h2>Customer Reviews : {this.state.data.rating}</h2>
      <h2>Booking Charge per Room per Day : $</h2><p id='price'>{this.state.data.pricePerRoom}</p>
      </div>
      <img src={this.state.data.links} id='img' alt=''/>
      </div>
      </div>
    )
  }
}