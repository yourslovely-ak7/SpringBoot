import './App.css';
import {BrowserRouter,Routes,Route} from 'react-router-dom';
import Login from './Components/Login';
import Register from './Components/Register';
import Home from './Components/Home';
import Profile from './Components/Profile';
import ShowTable from './Components/ShowTable';
import Hotels from './Components/Hotels';
import Booking from './Components/Booking';
import YourBookings from './Components/YourBookings';
import Update from './Components/Update';

function App() {
  return (
    <div className="App">
    <BrowserRouter>
    <Routes>
    <Route path='/' element={<Home/>}/>
    <Route path='/log' element={<Login/>}/>
    <Route path='/reg' element={<Register/>}/>
    <Route path='/profile' element={<Profile/>}/>
    <Route path='/showDB' element={<ShowTable/>}/>
    <Route path='/hotels' element={<Hotels/>}/>
    <Route path='/booking' element={<Booking/>}/>
    <Route path='/yourbook' element={<YourBookings/>}/>
    <Route path='/update' element={<Update/>}/>
    </Routes>
    </BrowserRouter>
    </div>
  );
}

export default App;
