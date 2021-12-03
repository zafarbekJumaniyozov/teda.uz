import axios from 'axios';
const Employees_Rest_api_url='http/localhost:8080/api/employees';

class EmployeeService{

  getEmployees(){
    return axios.get(Employees_Rest_api_url);
  }

}

export default new EmployeeService();
