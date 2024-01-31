// import { Form, ButtonToolbar, Button,} from 'rsuite';
// export default function Signup(){
//     return(
//         <div>
//   <Form style={{marginLeft:"35%",marginTop:"5%"}}>
//     <Form.Group controlId="fn">
//       <Form.ControlLabel>FirstName</Form.ControlLabel>
//       <Form.Control name="firstname" />
//     </Form.Group>
//     <Form.Group controlId="ln">
//       <Form.ControlLabel>LastName</Form.ControlLabel>
//       <Form.Control name="lastname"/>
//     </Form.Group>
//     <Form.Group controlId="email">
//     <Form.ControlLabel name="email" type="email">Email</Form.ControlLabel>
//       <Form.Control name="email"/>
//     </Form.Group>
//     <Form.Group controlId="password-1">
//       <Form.ControlLabel>Password</Form.ControlLabel>
//       <Form.Control name="password" type="password" autoComplete="off" />
//     </Form.Group>
//     <Form.Group controlId="input-group">
//     </Form.Group>
//     <Form.Group>
//       <ButtonToolbar>
//         <Button appearance="primary">Submit</Button>
//         <Button appearance="default">Cancel</Button>
//       </ButtonToolbar>
//     </Form.Group>
//   </Form></div>)

// }
import React from 'react';
import '../assets/css/signup.css';
import { Link } from "react-router-dom"; 
import { FaUser,FaLock } from "react-icons/fa";

export default function Signup() {
  return (
    <div className='signup-main'>
        <form action='' className='wrapper-signup'>
            <h1>SignUp</h1>
            <div className='input-box'>
                <input type='email' placeholder='Your email' required/>
                <FaUser className='icon'/>
            </div>
            <div className="input-box">
                <input type='password' placeholder='Your Password' required />
                <FaLock className='icon'/>
            </div>
            <div className="input-box">
                <input type='password' placeholder='Confirm Password' required />
                <FaLock className='icon'/>
            </div>
            <button type='submit' >Register</button>
            <div className="register-link">
                <p>Already Create an Account?<a href='#'><Link to='/login'>Login</Link></a></p>
            </div>
        </form>
    </div>
  )
}
