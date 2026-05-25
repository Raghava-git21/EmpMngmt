import  react from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./Home";
function Page2(){
    return(
        <>
        <h1>Page2</h1>
        <BrowserRouter>
        <Routes>
            <Route path="/Home" element={<Home/>}/>
        </Routes>
        </BrowserRouter>
        </>
    )
}