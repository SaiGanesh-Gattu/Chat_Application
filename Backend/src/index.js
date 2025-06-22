import express from "express";

import authRoutes from "../src/routers/authRouter.js";


const app=express();

app.use("/auth",authRoutes);

app.listen(3000,()=>{
    console.log("Server is listening on 3000 port");
})