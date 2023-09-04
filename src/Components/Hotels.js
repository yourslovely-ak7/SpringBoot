import axios from 'axios';
import React, { Component } from 'react'
import Booking from './Booking';

export default class Hotels extends Component {


    state={
        data:[],
        book: false,
        selectedHotelId:'',
        selectedPrice:'',
    }
    componentDidMount()
    {
        const { city, hotel } = this.props;
        //alert(`The data for city: ${city} and hotel: ${hotel}`)

       // const city='Chennai';
       // const hotel='The Park';
      axios.get(`http://localhost:8082/hotgetbyQ/${hotel}/${city}`)
      .then(response => {
          this.setState({data: response.data});
          
      })

      .catch(error =>{
          console.log(error);
      });
    }

     bookRooms= (e,hotelId)=>
     {
      e.preventDefault();

      this.setState({book: true, selectedHotelId: hotelId});
      alert('The hotel is selected. Please scroll down to book your rooms!');
     }

  render() {

    return (
      <div>
      <table>
      <tbody>
      {
        this.state.data.map(hotel=>(
            <tr key={hotel.hotelId}>
            <td>
            <div id='data'>
            <h1 id='hn' >{hotel.hotelName}</h1>
            <div id='det'>
            <h2>Hotel ID : {hotel.hotelId}</h2>
            <h2>Address : {hotel.address}</h2>
            <h2>City : {hotel.city}</h2>
            <h2>Customer Reviews : {hotel.rating}</h2>
            <h2>Booking Charge per Room per Day : $</h2><p id='price'>{hotel.pricePerRoom}</p>
            <button id='rbut' onClick={(e) => this.bookRooms(e, hotel.hotelId)}><h3>Book your rooms Here!</h3></button>
            </div>
            <img src={hotel.links} id='img' alt=''/>
            </div>
            
            </td>
            </tr>
        ))
      }
      </tbody>
      </table>
      {this.state.book && <Booking hotelid={this.state.selectedHotelId}/>}
      </div>
    )
  }
}
