CREATE TABLE contacts(
  id IDENTITY,
  firstName VARCHAR(30) NOT NULL,
  lastName VARCHAR(50) NOT NULL ,
  phoneNumber VARCHAR(13),
  emailAddress VARCHAR(30)
);
INSERT INTO contacts (id, firstName, lastName, phoneNumber, emailAddress) VALUES (12,'Maciej','Cebula','601226288','maciejcebula96@gmail.com');