//Cohen Sutherland Line Clipping Algorithm

public void CohenSutherland(double x0, double y0, double x1, double y1){

       
       int outCode;
       int outCode_0=makeCode(x0,y0);
  	   int outCode_1=makeCode(x1,y1);
  	    
  	   double x=0;
  	   double y=0;
  	   boolean accept = false;
  	   
  	   while(true){
  	   
  	   
  	   if((outCode_0 | outCode_1)==0){ //Bitwise OR is 0
  		  
         //fully accept
  		   accept=true;
  		   break;
  		   
  	   }else if ((outCode_0 & outCode_1)!=0){
       
         //fully reject
  		   accept=false;
  		   break;
         
  	   }else{ // Partially Accepted
  		   
  		   if(outCode_0>0){
  			   outCode=outCode_0;
  			   
  		   }else{
  			   outCode=outCode_1;
  		   }
  		   if((outCode & top)!=0){
  			   
  			   Y=Ymax;
  			   X = x0 + (x1 - x0) * (Ymax - y0) / (y1 - y0);
  			   
  		   }else if((outCode & bottom)!=0){
  			 
  			   Y=Ymin;
  			   X = x0 + (x1 - x0) * (Ymin - y0) / (y1 - y0);
           
  		   }if((outCode & right)!=0){
  			  
  			   X=Xmax;
  			   Y = y0 + (y1 - y0) * (Xmax - x0) / (x1 - x0);
  			   
  		   }else if((outCode & left)!=0){
  			   
  			   X=Xmin;
  			   Y = y0 + (y1 - y0) * (Xmin - x0) / (x1 - x0);
           
  		   }
         
  		   if(outCode==outCode_0){
         
  			   x0=X;
  			   y0=Y;
  			   outCode_0=makeCode(x0,y0);
           
  		   }if(outCode==outCode_1){
         
  			   x1=X;
  			   y1=Y;
  			   outCode_1=makeCode(x1,y1);
           
  		   }
  	   } //End of while
     } //End