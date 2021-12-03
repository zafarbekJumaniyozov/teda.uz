import React, { useEffect,useState } from 'react'




function EmployeeComponent() {

  const [employees, setEmployee] = useState([]);

  useEffect(()=>{
    getEmployees()
  },[])
  const getEmployees=()=>{

    // eslint-disable-next-line no-undef
    EmployeeService.getEmployees().then((response)=>{
      setEmployee(response.data)
      console.log(response.data)
    });

  }

  return (
    <div className='container'>

      <h1 className='text-center'>Employees List</h1>
      <table className='table table-striped' >
        <thead>
        <tr>
          <th>Employee id</th>
          <th>Employee first name</th>
          <th>Employee last name</th>
          <th>Employee email</th>
        </tr>


        </thead>
        <tbody>

        <tr>
          <th>Employee id</th>
          <th>Employee first name</th>
          <th>Employee last name</th>
          <th>Employee email</th>
        </tr>


        {

          employees.map(employee=>
            <tr key={employee.id} >
              <td>{employee.id}</td>
              <td>{employee.firstName}</td>
              <td>{employee.lastName}</td>
              <td>{employee.email}</td>
            </tr>
          )
        }
        </tbody>
      </table>

    </div>
  )
}
export default EmployeeComponent;
