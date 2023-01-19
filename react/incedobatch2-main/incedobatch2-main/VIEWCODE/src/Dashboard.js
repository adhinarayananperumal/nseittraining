import React, { useState, useEffect } from "react";
import { Link } from 'react-router-dom';
import { Button, ButtonGroup, Container, Table } from 'reactstrap';


export default function Dashboard() {

  let loaded = false;
  const [employee, setEmployee] = useState({});

  const [loading, setLoading] = useState(true)


  


  useEffect(() => {
    alert("dashboard use effort");
    setLoading(true);
    listEmp();
    console.log("Call fired....");
  }, []);


  const remove = async (empId) => {
    await fetch(`http://localhost:8080/employee/deleteEmp/${empId}`, {
      method: 'DELETE',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    }).then(() => {
      listEmp();
    });
  }

  async function listEmp() {
    alert("list employee");
    const response = await fetch('http://localhost:8080/employee/listEmp');
    const json = await response.json();
    setEmployee(json);
    console.log(json);
    loaded = true;
    setLoading(false);
  }


  if (loading) {
    return <p>Loading...</p>;
  }

  return (
    <div>
      <ul>
        <li>
          <Link to="/registerNewEmployee">Go to Register Employee Screen</Link>
        </li>
      </ul>

      <h2>Our dashboard details</h2>
      <table border="2">
        <thead>
          <tr>
            <th width="30%">Emp Id</th>
            <th width="30%">Employee Name</th>
            <th width="30%">Age</th>
            <th width="40%">Status</th>
          </tr>
        </thead>
        <tbody>
          {
            employee.listEmp.map(e => (
              <tr key={e.empId}>
                <td> {e.empId}</td>
                <td >{e.employeeName}</td>
                <td >{e.age}</td>
                <td >{e.status}</td>
              <td>  <a onClick={() => remove(e.empId)}>Delete</a> </td>

              <td>   <Button size="sm" color="primary" tag={Link} to={"/editEmployee/" + e.empId}>Edit</Button> </td> 

              </tr>
            ))


          }

        </tbody>
      </table>

    </div>

  )
}