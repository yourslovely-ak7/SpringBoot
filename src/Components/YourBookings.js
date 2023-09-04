import axios from 'axios';
import React, { Component } from 'react'
import ShowUser from './UserGetById';
import Update from './Update';

export default class YourBookings extends Component {
    state={
        data:[],
        showHotel: false,
        id: '',
        formDat:[],
        editData: false,
    }

    
    componentDidMount()
    {
      axios.get('http://localhost:8082/bookget')
      .then(response => {
          this.setState({data: response.data});
      })

      .catch(error =>{
          console.log(error);
      });
    }

    hotelShow=(e,hotel_id)=>
    {
        e.preventDefault();

        this.setState({showHotel: true , id:hotel_id})
    }

    deleteBooking = (e, bookingId) => {
        e.preventDefault();
      
        axios
          .delete(`http://localhost:8082/bookdelbyid/${bookingId}`)
          .then((response) => {
            // Check if the response data is an array (or whatever structure you expect)
            if (Array.isArray(response.data)) {
              // Update the state with the updated data received from the server
              this.setState({ data: response.data });
              // Show an alert message to inform the user
            } else {
              // Handle unexpected response here (e.g., log an error)
              console.error('Unexpected response data:', response.data);
            }
            alert(`The booking ID: ${bookingId} has been cancelled! Kindly refresh the page.`);
          })
          .catch((error) => {
            console.log(error);
          });
      };
      
      updateBooking= (e,bookingId)=>{
        e.preventDefault();

        this.setState({editData: true , id:bookingId})
      }
       
  render() {
    return (
      <div>
      <img id='back'  alt='' src='https://indiacityblog.com/wp-content/uploads/2020/04/tourmyinida.jpg'/>
      <div id='finalbox'>
      <h1>Booking Records:</h1>
      <table>
      <tbody>
      {
        this.state.data.map(book=>(
            <tr key={book.bookingId}>
            <td>
            <div id='box4'>
            <h3 id="bid"   class="fir">Booking ID : {book.bookingId}</h3>
            <h3 id="buid"  class="fir">User ID : {book.user_id}</h3>
            <h3 id="bhid"  class="fir">Hotel ID : {book.hotel_id}</h3>
            <h4 id="broom" class="fir">No. of rooms Booked : {book.bookedRooms}</h4>
            <h4 id="bcin"  class="fir">Check In : {book.checkInDate}</h4>
            <h4 id="bcout" class="fir">Check Out : {book.checkOutDate}</h4>
            <h4 id="btot"  class="fir">Total Amount : {book.totalAmount}</h4>
            <button id='but1' class="butts" onClick={(e)=>{this.hotelShow(e,book.hotel_id)}}>Hotel Details</button>
            <button id='but2' class="butts" onClick={(e)=>{this.deleteBooking(e,book.bookingId)}}>Cancel Booking!</button>
            <button id='but3' class="butts" onClick={(e)=>{this.updateBooking(e,book.bookingId)}}>Update Details</button>
            </div>
            </td>
            </tr>
        ))
      }
      </tbody>
      {this.state.showHotel && <ShowUser id={this.state.id}/>}
      {this.state.editData && <Update id={this.state.id}/>}
      </table>
      </div>
      </div>
    )
  }
}
