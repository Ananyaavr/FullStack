// import './assets/css/login.css'
import { Suspense, lazy } from "react"
import {RouterProvider, createBrowserRouter} from "react-router-dom"
import Home from "./pages/Homepage/Home.jsx"
import Spinner from "./components/spinner"
import Login from './pages/Login.jsx'
import Signup from './pages/Signup.jsx';
import User from "./pages/Usermodules/User.jsx"
import UserForm from "./pages/Usermodules/UserForm.jsx"

const Lazyabout=lazy(()=>import("./pages/Homepage/About.jsx"))
const Lazycontact=lazy(()=>import("./pages/Homepage/Contact.jsx"))

const App=()=>{
  const router = createBrowserRouter([
    {
      path: `/home`,
      element:<Suspense fallback={<Spinner/>}><Home/></Suspense>
    },
    {
      path: `/about`,
      element:<Suspense fallback={<Spinner/>}><Lazyabout/></Suspense>
    },
    {
      path: `/contact`,
      element:<Suspense fallback={<Spinner/>}><Lazycontact/></Suspense>
    },
    {
      path: `/login`,
      element:<Suspense fallback={<Spinner/>}><Login/></Suspense>
    },
    {
      path: `/signup`,
      element:<Suspense fallback={<Spinner/>}><Signup/></Suspense>
    },
    {
      path:`/user`,
      element:<Suspense fallback={<Spinner/>}><User/></Suspense>
    },
    {
      path:`/userform`,
      element:<Suspense fallback={<Spinner/>}><UserForm/></Suspense>
    }
  ])

    return (
    <RouterProvider router={router}/>
  )
}

export default App;