import React, { useState } from "react";
//https://www.freecodecamp.org/news/how-to-create-forms-in-react-using-react-hook-form/

import axios from "axios";

export default function CustomerRegistrationForm() {


    const [state, setState] = useState({
        firstName: "",
        age: ""
    });

    const handleInputChange = (event) => {
        const { name, value } = event.target;
        setState((prevProps)  =>({
            ...prevProps,
            [name]: value
        }));
    };

    function createCustomer() {
        console.log("state....." + JSON.stringify(state))
        axios.post("http://localhost:8080/customer/save", {
          title: "Hello World!",
          body: JSON.stringify(state) 
        })
        .then((response) => {
          console.log(response.data);
        });

      }
    


    const handleSubmit = (event) => {
        event.preventDefault();
        console.log(state);
        createCustomer();
    };


    return (

        <div>
            <h3 class="text-center"> Customer Registration Form</h3>

            <form onSubmit={handleSubmit}>
                <div className='inputField'>
                    <label>
                        <span>Enter First Name</span>
                    </label>
                    <input
                        type='text'
                        name='firstName'
                        onChange={handleInputChange}
                        placeholder='Your first name'
                        value={state.firstName}
                    />
                </div>
                <div className='inputField'>
                    <label>
                        <span>Enter Age</span>
                    </label>
                    <input
                        type='number'
                        name='age'
                        onChange={handleInputChange}
                        placeholder='Your age'
                        value={state.age}
                    />
                </div>


                <button type='submit'>Submit</button>
            </form>
        </div>
    );
};






