import React from "react";
import {
  BrowserRouter, Link, Route, Routes
} from "react-router-dom";

import './App.css';
import Home from './Home';
import Service from './Service';
import CustomerRegistrationForm from './CustomerRegistrationForm';



function App() {
  return (

    <div class="container-fluid">
      <h1 class="text-center">  ICICI Bank </h1>
      <hr></hr>


      <BrowserRouter>

        <ul class="nav navbar-nav">
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <Link to="/service">Service</Link>
          </li>
          <li>
            <Link to="/customerRegForm">Customer Registration Form</Link>
          </li>

        </ul>

        <hr/>

        <Routes>
          <Route path="/" element={<Home/>} />
          <Route path="service" element={<Service/>} />
          <Route path="customerRegForm" element={<CustomerRegistrationForm/>} />
        </Routes>

      </BrowserRouter>

    </div>
  );
}

export default App;
