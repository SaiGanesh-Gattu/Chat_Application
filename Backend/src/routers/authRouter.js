import express from "express";
import signup from "../services/authService.js";

const router=express.Router();


router.get("/signup",signup);


router.get("/login",(req,res)=>{
   res.send("login  Successful");
});

router.get("/logout",(req,res)=>{
   res.send("log out  Successful");
});


export default router;