// import Button from "../components/Button";
// import TextField from "../components/TextField";

// const Login=()=>{
//     return(
//         <>
//           <TextField type="text" name="username" placeholder="User Name"/>
//           <TextField type="number" name="phoneNumber" placeholder="Phone Number"/>
//           <Button name="Login" />
//           <Button name="SignUp" />
//         </>
//     )
// }
// export default Login;
// pages/Login.jsx
// import React, { useState } from "react";
// import { useNavigate } from "react-router-dom";
// import Button from "../components/Button";
// import TextField from "../components/TextField";
// // import "./styles/Login.css"; // Import the CSS file

// const Login = () => {
//   const [username, setUsername] = useState("");
//   const [phoneNumber, setPhoneNumber] = useState("");

//   const history = useNavigate();

//   const handleLogin = () => {
//     // Your authentication logic goes here
//     // For simplicity, let's assume successful login for now
//     history.push("/dashboard"); // Redirect to dashboard after login
//   };

//   const handleSignUp = () => {
//     // Redirect to the signup page or handle signup logic
//     history.push("/signup");
//   };

//   return (
//     <div className="login-container">
//       <h2>Login to Job Portal</h2>
//       <form className="login-form">
//         <TextField
//           type="text"
//           name="username"
//           placeholder="Username"
//           value={username}
//           onChange={(e) => setUsername(e.target.value)}
//         />
//         <TextField
//           type="tel"
//           name="phoneNumber"
//           placeholder="Phone Number"
//           value={phoneNumber}
//           onChange={(e) => setPhoneNumber(e.target.value)}
//         />
//         <Button name="Login" onClick={handleLogin} />
//         <Button name="SignUp" onClick={handleSignUp} />
//       </form>
//     </div>
//   );
// };

// export default Login;

// import {  
//   Content, 
//   FlexboxGrid, 
//   Panel, 
//   Form, 
//   ButtonToolbar, 
//   Button,  
// } from "rsuite"; 
// import "rsuite/dist/rsuite.min.css";
// import { Link } from "react-router-dom"; 
// import "../assets/css/login.css";
// export default function Login() { 
//   return ( 
//       <div className="login-form"> 
//           <Button appearance="secondary" color="green"><Link to="/signup">Sign up</Link></Button> 
//               <div style={{ textAlign: "center",margin:"8%" }}> 
//               </div> 
//               <Content> 
//                   <FlexboxGrid justify="center" style={{ margin:20}}> 
//                       <FlexboxGrid.Item colspan={8}> 
//                           <Panel header={<h3 className="loginhead">Already a user? Login</h3>} bordered> 
//                               <Form fluid> 
//                                   <Form.Group> 
//                                       <Form.ControlLabel> 
//                                           Email 
//                                       </Form.ControlLabel> 
//                                       <Form.Control name="email"
//                                           type="email" /> 
//                                   </Form.Group> 
//                                   <Form.Group> 
//                                       <Form.ControlLabel> 
//                                           Password 
//                                       </Form.ControlLabel> 
//                                       <Form.Control name="password"
//                                           type="password" /> 
//                                   </Form.Group> 
//                                   <Form.Group> 
//                                       <ButtonToolbar> 
//                                       <Button appearance="secondary"
//                                               color="green"> 
//                                               <Link to="/signup">Sign in</Link>
//                                           </Button> 
//                                           <Button appearance="link"> 
//                                               Forgot password? 
//                                           </Button> 
//                                       </ButtonToolbar> 
//                                   </Form.Group> 
//                               </Form> 
//                           </Panel> 
//                       </FlexboxGrid.Item> 
//                   </FlexboxGrid> 
//               </Content> 
//       </div> 
//   ); 
// }

import React from 'react';
import '../assets/css/login.css';
import { Link } from "react-router-dom"; 
import { FaUser,FaLock } from "react-icons/fa";


export default function Login() {
  return (
    <div className='login-main'>
        <form action='' className='wrapper'>
        <h1 className="text-3xl font-bold underline">
      Hello world!
    </h1>
            <h1>Login</h1>
            <div className='input-box'>
                <input type='text' placeholder='UserName' required/>
                <FaUser className='icon'/>
            </div>
            <div className="input-box">
                <input type='password' placeholder='Password' required />
                <FaLock className='icon'/>
            </div>
            <div className="remember-forgot">
                <label><input type='checkbox'/>Remember me</label>
                <a href='#'>Forgot Password?</a>
            </div>
            <button type='submit' >Login</button>
            <div className="register-link">
                <p>Don't have an account?<a href='#'><Link to="/signup">Register</Link></a></p>
            </div>
        </form>
    </div>
  )
}


