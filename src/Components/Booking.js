import axios from 'axios';
import React, { Component } from 'react'

export default class Booking extends Component {

    constructor(props)
    {
        super(props);
        this.state={
            user_id:'',
            hotel_id: props.hotelid,
            bookedRooms:'',
            checkInDate:'',
            checkOutDate:'',
            totalAmount:''
        }
    }

    handleSubmit= (e)=>{
        e.preventDefault();

        const data={
          //  userId: this.state.userId,
          user_id:this.state.user_id,
          hotel_id: this.state.hotel_id,
          bookedRooms:this.state.bookedRooms,
          checkInDate:this.state.checkInDate,
          checkOutDate:this.state.checkOutDate,
          totalAmount:this.state.totalAmount,
        };
        axios.post('http://localhost:8082/bookpost',data)

        alert(`Your Rooms have been booked!`)
    };

  render() {
    return (

      <div>
      <img id='bookimg' alt='' src='https://www.greavesindia.com/wp-content/uploads/2019/05/Best-Hotels-in-Tamil-Nadu_Connemara_credit-Taj.jpg'/>
      <div id='bookingpage'>
      <form onSubmit={this.handleSubmit}>
      <label class="booklabel">User ID</label>
      <input class="bookfield" type='number' placeholder='Enter your UserID' value={this.state.user_id} onChange={(e)=>{this.setState({user_id:e.target.value})}}/>
      <br/><br/>
      <label class="booklabel">Hotel Id</label>
      <input class="bookfield" type='number' value={this.state.hotel_id} readOnly />
      <br/><br/>
      <label class="booklabel">No.of rooms needed</label>
      <input class="bookfield" type='number' placeholder='Enter the no.of req. rooms' value={this.state.bookedRooms} onChange={(e)=>{this.setState({bookedRooms:e.target.value})}}/>
      <br/>
      <h3 id='header'>Date for Booking</h3>
      <label class="booklabel">Check In Date</label>
      <input class="bookfield" type='text' placeholder='CheckInDate' value={this.state.checkInDate} onChange={(e)=>{this.setState({checkInDate:e.target.value})}} pattern="\d{4}/\d{2}/\d{2}"/>
      <br/><br/>
      <label class="booklabel">Check Out Date</label>
      <input class="bookfield" type='text' placeholder='CheckOutDate' value={this.state.checkOutDate} onChange={(e)=>{this.setState({checkOutDate:e.target.value})}} pattern="\d{4}/\d{2}/\d{2}"/>
      <br/>
      <label class="booklabel">Total Bill Amount</label>
      <input class="bookfield" type='text' placeholder='Total Amount' value={this.state.totalAmount} onChange={(e)=>{this.setState({totalAmount:e.target.value})}}/>
      <br/><br/>
      <button id='bookbut' type='submit'>Book Now!</button>
      </form>
      </div>
      </div>
    )
  }
}
