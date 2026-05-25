import { useState } from 'react'
import axios from 'axios';
function Home() {
    const [count, setCount] = useState(0);
    const [id,setid] = useState(1);
    const [name,setname] = useState();
    async function getallusers(){
        let response = await axios.get('https://jsonplaceholder.typicode.com/users');
        console.log(response.data);
    }
    return ( 
    <>
    <h1>Homes</h1>
    <button onClick={()=>setCount(count + 1)}>Increment</button>
    <p>You clicked {count} times</p>
    <button onClick={()=>setid(id - 1)}>Decrement</button>
    <p>You clicked {id} times</p>
    <input type="text" name="" id="" onChange={(e)=>setname(e.target.value)} />
    <p>Your name is {name}</p>
    <button onClick={getallusers}>Get users</button>
    </>
    )
}

export default Home;