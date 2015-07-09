while(j<2000000){
    db.users.insert({"contactNumber" : ""+i,"createdDate" : ISODate("2015-07-06T11:37:45.187Z"),"jobTitle" : "Java Developer","name" : "Mujeeb"+i,"professionalSummary" : "Open Source Billing product contributer","totalExperience" : ""+j+"years"});
    i++;
    j++;
 };

02:02:26

{"contactNumber" : ""+i,"createdDate" : ISODate("2015-07-06T11:37:45.187Z"),"jobTitle" : "Java Developer","name" : "Mujeeb"+i,"professionalSummary" : "Open Source Billing product contributer","totalExperience" : ""+j+"years"}


 db.users.find({_id: ObjectId("559e1a935db0753c9c20ac3c")})  
 
 