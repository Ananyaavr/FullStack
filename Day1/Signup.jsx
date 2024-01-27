import { Form, ButtonToolbar, Button,} from 'rsuite';
export default function Signup(){
    return(
        <div>
  <Form style={{marginLeft:"35%",marginTop:"5%"}}>
    <Form.Group controlId="fn">
      <Form.ControlLabel>FirstName</Form.ControlLabel>
      <Form.Control name="firstname" />
    </Form.Group>
    <Form.Group controlId="ln">
      <Form.ControlLabel>LastName</Form.ControlLabel>
      <Form.Control name="lastname"/>
    </Form.Group>
    <Form.Group controlId="email">
    <Form.ControlLabel name="email" type="email">Email</Form.ControlLabel>
      <Form.Control name="email"/>
    </Form.Group>
    <Form.Group controlId="password-1">
      <Form.ControlLabel>Password</Form.ControlLabel>
      <Form.Control name="password" type="password" autoComplete="off" />
    </Form.Group>
    <Form.Group controlId="input-group">
    </Form.Group>
    <Form.Group>
      <ButtonToolbar>
        <Button appearance="primary">Submit</Button>
        <Button appearance="default">Cancel</Button>
      </ButtonToolbar>
    </Form.Group>
  </Form></div>)

}