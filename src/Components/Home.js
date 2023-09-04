import { useState } from "react";
import { Link } from "react-router-dom";
import Hotels from "./Hotels";

export default function Home()
{
    const[city, setCity]=useState('')
    const[name, setName]= useState('')
    const [showHotels, setShowHotels] = useState(false);

    const handleClick=(e)=>{
        e.preventDefault();

      //  alert(`The city: ${city} and Hotel: ${name}`);
       setShowHotels(true);
       
    }

    return(
        <div id="box2">
        <div id="head2" >
        <h1 id="topic">Book My Stay</h1>
        <img src="https://clipart-library.com/image_gallery/n347572.jpg" alt="1" id="logo"/>
        <nav>
        <Link to='/yourbook'><button id="book">Your Bookings</button></Link>
        <Link to='/log'><button id="log">Login</button></Link>
        <Link to='/profile'><img id="prof" src="https://www.freeiconspng.com/thumbs/profile-icon-png/am-a-19-year-old-multimedia-artist-student-from-manila--21.png" alt=""/></Link>
        </nav>
        </div>
        <img alt="2" src="https://www.venuereport.com/media/cache/resolve/venue_roundup_single_image/uploads/+0Regular_Roundup/2017Hotels/The-William-Vale-2.jpg" id="sbox"/>
        <div id="caption">
        <h1 id="moto">"Book your Stay" from your Stay</h1>
        <h2 id="lines">An emerging online HOTEL booking platform.<br/> Connects you to hundreds of Hotels all over the world.<br/><br/>Great offers and Discounts are onLine.<br/>Book your rooms before your "Trip is ON"<br/><br/>What are you waiting for...<br></br>Hurry Up and Register your account.</h2>
        <img id="disc" alt="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8jzlyvPhQvOqq9GIZot4fKf-3ayqjfej-2g&usqp=CAU"/>
        <h4 id="discount">FOR EACH BOOKING!</h4>
        </div>

        <label id="cs" class="label" >Search by City</label>
        <input id="cf" class="field2" type="text" placeholder="Enter the city name" value={city} onChange={(e)=>setCity(e.target.value)}/>
        <label id="hs" class="label" >Search by Hotel Name</label>
        <input id="hf" class="field2" type="text" placeholder="Enter the HotelName" value={name} onChange={(e)=>setName(e.target.value)}/>
        <button id="search" type="submit" onClick={handleClick}><img id="icon" src="https://www.freepnglogos.com/uploads/search-png/search-icon-transparent-images-vector-15.png" alt="search"/></button>
        <div id="result">
        {showHotels && <Hotels city={city} hotel={name}/>}
        </div>
        </div>  
    )
}