

        document.getElementById("loginbtn").addEventListener("click",function()
        {
            x=document.getElementsByName("username")[0].value;
            y=document.getElementsByName("password")[1].value;
            if(x=="Admin1" && y=="Admin1231")
            {
                document.getElementById("errormsg").innerHTML="valid";
                document.getElementById("errormsg").style.display="block";
            }
            else{
                document.getElementById("errormsg").innerHTML="Invalid";
                document.getElementById("errormsg").style.display="block";
            }
        })

        document.getElementById("lbtn").addEventListener("click",function()
        {
            document.querySelector(".popup").style.display="flex";
            document.getElementById("errormsg").innerHTML="";
            document.getElementById("errormsg").style.display="none";
            document.getElementsByName("username")[0].value="";
            document.getElementsByName("password")[0].value="";
        })

        document.querySelector(".close").addEventListener("click",function()
        {
            document.querySelector(".popup").style.display="none";
        })
