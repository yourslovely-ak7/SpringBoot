import axios from 'axios';
import React, { Component } from 'react'

export default class Update extends Component {

    constructor(props) {
        super(props);
        this.state = {
          bookingId: '',       
          user_id: '',
          hotel_id: '',
          bookedRooms: '',
          checkInDate: '',
          checkOutDate: '',
          totalAmount: '',
        };
      }
      

      componentDidMount() {
        const { id } = this.props;
      
        axios
          .get(`http://localhost:8082/bookgetbyid/${id}`)
          .then((response) => {
            const { bookingId, user_id, hotel_id, bookedRooms, checkInDate, checkOutDate, totalAmount } = response.data;
            this.setState({
              bookingId,
              user_id,
              hotel_id,
              bookedRooms,
              checkInDate,
              checkOutDate,
              totalAmount,
            });
          })
          .catch((error) => {
            console.log(error);
          });
      }
      


    handleSubmit= (e)=>{
        e.preventDefault();
        
        const formData={
            bookingId:this.state.bookingId,
            user_id:this.state.user_id,
            hotel_id: this.state.hotel_id,
            bookedRooms: this.state.bookedRooms,
            checkInDate: this.state.checkInDate,
            checkOutDate: this.state.checkOutDate,
            totalAmount: this.state.totalAmount,
        };
        
      axios.put(`http://localhost:8082/bookput`,formData)
      .then(response => {
        console.log(response.data);
      })
      .catch(error => {
        console.error(error);
      })
      alert("Sucessfullyupdated")
  };

  render() {
    return (
      <div id='box5'>
      <form id="text1" onSubmit={this.handleSubmit}>
        <br/>
        <label>Booking ID</label>
        <input type="number" id="uname" class="field1" value={this.state.bookingId} readOnly/>
        <br/><br/>

        <label>User ID</label>
        <input type="number" id="age" class="field1" value={this.state.user_id} readOnly/>
        <br/><br/>

        <label>Hotel ID</label>
        <input type="number" id="num" class="field1" value={this.state.hotel_id} readOnly/>
        <br/><br/>

        <label>No. of rooms booked:</label>
        <input type="number" id="num" class="field1" value={this.state.bookedRooms} onChange={(e)=>{this.setState({bookedRooms:e.target.value})}}/>
        <br/><br/>

        <label>CheckInDate :</label>
        <input type="text" id="num" class="field1" value={this.state.checkInDate} onChange={(e)=>{this.setState({checkInDate:e.target.value})}}  pattern="\d{4}/\d{2}/\d{2}"/>
        <br/><br/>

        <label>CheckOutDate :</label>
        <input type="text" id="num" class="field1" value={this.state.checkOutDate} onChange={(e)=>{this.setState({checkOutDate:e.target.value})}}  pattern="\d{4}/\d{2}/\d{2}"/>
        <br/><br/>

        <label>Total Amount :</label>
        <input type="text" id="num" class="field1" value={this.state.totalAmount} readOnly/>
        <br/><br/>
        <button type="submit" id="reg">Submit!</button>
        </form>
      </div>
    )
  }
}
