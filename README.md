## Car Dealership - OOP
### Description
This project implements a vehicle management system that allows users to register, log in, and manage different types of vehicles, including Cars, Motorcycles, and Trucks. The application processes user commands for adding, removing, and commenting on vehicles, all while maintaining data integrity through comprehensive validation.

### Architecture
#### User Management: Secure registration and login functionalities to manage user profiles.
#### Vehicle Models: Three vehicle types with specific attributes and validation rules.
#### Commenting System: Users can leave comments on vehicles, enhancing interaction.
#### Command Processing: Supports various commands for vehicle and user management.

### Running the Application
Run the application using the `Startup` class, which serves as the entry point. The application will prompt you to enter inputs directly in the console.

### Sample Input
```
RegisterUser p Petar Petrov 123456
RegisterUser pesh0= Petar Petrov 123456
RegisterUser pesh0 Petar Petrov 1234
RegisterUser pesh0 Petar P 123456
RegisterUser pesh0 P Petrov 123456
RegisterUser pesho Petar Petrov 123456
AddVehicle Motorcycle K Z1000 9999 Race
AddVehicle Motorcycle Kawasaki Z1000 -1000 Race
AddVehicle Motorcycle Kawasaki Z1000 9999 N
AddVehicle Car Opel Vectra 5000 -1
AddVehicle Truck Volvo FH4 11800 200
AddVehicle Motorcycle Kawasaki Z 9999 Race
AddVehicle Car Opel Vectra 5000 5
AddVehicle Car Mazda 6 10000 5
AddVehicle Motorcycle Suzuki V-Strom 7500 CityEnduro
AddVehicle Car BMW Z3 11200 2
AddVehicle Car BMW Z3 11200 2
AddVehicle Car BMW Z3 11200 2
AddComment {{U}} pesho 1
AddComment {{Amazing speed and handling!}} pesho 1
ShowUsers
RegisterUser pesho Petar Petrov 123457
Logout
RegisterUser pesho Petar Petrov 123457
RegisterUser gosho Georgi Georgiev 123457 VIP
Logout
Login pesho 123456
Login gosho 123457
Logout
Login gosho 123457
AddComment {{I like this one! It is faster than all the rest!}} pesho 1
RemoveComment 1 1 pesho
RemoveComment 2 5 pesho
AddVehicle Motorcycle Suzuki GSXR1000 8000 Racing
AddVehicle Car Skoda Fabia 2000 5
AddVehicle Car BMW 535i 7200 5
AddVehicle Motorcycle Honda Hornet600 4150 Race
AddVehicle Car Mercedes S500L 15000 5
AddVehicle Car Opel Zafira 8000 5
AddVehicle Car Opel Zafira 7450 5
AddVehicle Truck Volvo FH4 11800 40
ShowUsers
Logout
RegisterUser ivancho Ivan Ivanov admin Admin
AddVehicle Car Skoda Fabia 2000 5
ShowUsers
ShowVehicles gosho
ShowVehicles ivanch0
AddComment {{Empty comment}} pencho 1
AddComment {{Empty comment}} pesho 20
RemoveComment 1 1 pesho
ShowVehicles pesho
Logout
Login pesho 123456
AddComment {{I dream of having this one one day.}} pesho 1
Logout
Login ivancho admin
AddComment {{What is the mileage on it?}} pesho 3
Logout
Login pesho 123456
AddComment {{This one passed my by on the highway today. So pretty!}} pesho 3
ShowVehicles pesho
ShowVehicles gosho
ShowVehicles ivancho
Logout
Login gosho 123457
RemoveComment 1 2 pesho
ShowVehicles pesho
Logout
Login pesho 123456
RemoveVehicle 1
ShowVehicles pesho
Exit

```
### Sample Output
```
Username must be between 2 and 20 characters long!
####################
Username contains invalid symbols!
####################
Password must be between 5 and 30 characters long!
####################
Lastname must be between 2 and 20 characters long!
####################
Firstname must be between 2 and 20 characters long!
####################
User pesho registered successfully!
####################
Make must be between 2 and 15 characters long!
####################
Price must be between 0.0 and 1000000.0!
####################
Category must be between 3 and 10 characters long!
####################
Seats must be between 1 and 10!
####################
Weight capacity must be between 1 and 100!
####################
pesho added vehicle successfully!
####################
pesho added vehicle successfully!
####################
pesho added vehicle successfully!
####################
pesho added vehicle successfully!
####################
pesho added vehicle successfully!
####################
You are not VIP and cannot add more than 5 vehicles!
####################
You are not VIP and cannot add more than 5 vehicles!
####################
Content must be between 3 and 200 characters long!
####################
pesho added comment successfully!
####################
You are not an admin!
####################
User pesho is logged in! Please log out first!
####################
You logged out!
####################
User pesho already exist. Choose a different username!
####################
User gosho registered successfully!
####################
You logged out!
####################
User pesho successfully logged in!
####################
User pesho is logged in! Please log out first!
####################
You logged out!
####################
User gosho successfully logged in!
####################
gosho added comment successfully!
####################
You are not the author of the comment you are trying to remove!
####################
There is no comment on this index.
####################
gosho added vehicle successfully!
####################
gosho added vehicle successfully!
####################
gosho added vehicle successfully!
####################
gosho added vehicle successfully!
####################
gosho added vehicle successfully!
####################
gosho added vehicle successfully!
####################
gosho added vehicle successfully!
####################
gosho added vehicle successfully!
####################
You are not an admin!
####################
You logged out!
####################
User ivancho registered successfully!
####################
You are an admin and therefore cannot add vehicles!
####################
--USERS--
Username: pesho, FullName: Petar Petrov, Role: Normal
Username: gosho, FullName: Georgi Georgiev, Role: VIP
Username: ivancho, FullName: Ivan Ivanov, Role: Admin
####################
--USER gosho--
Motorcycle:
Make: Suzuki
Model: GSXR1000
Wheels: 2
Price: $8000
Category: Racing
--NO COMMENTS--
Car:
Make: Skoda
Model: Fabia
Wheels: 4
Price: $2000
Seats: 5
--NO COMMENTS--
Car:
Make: BMW
Model: 535i
Wheels: 4
Price: $7200
Seats: 5
--NO COMMENTS--
Motorcycle:
Make: Honda
Model: Hornet600
Wheels: 2
Price: $4150
Category: Race
--NO COMMENTS--
Car:
Make: Mercedes
Model: S500L
Wheels: 4
Price: $15000
Seats: 5
--NO COMMENTS--
Car:
Make: Opel
Model: Zafira
Wheels: 4
Price: $8000
Seats: 5
--NO COMMENTS--
Car:
Make: Opel
Model: Zafira
Wheels: 4
Price: $7450
Seats: 5
--NO COMMENTS--
Truck:
Make: Volvo
Model: FH4
Wheels: 8
Price: $11800
Weight Capacity: 40t
--NO COMMENTS--
####################
There is no user with username ivanch0!
####################
There is no user with username pencho!
####################
The vehicle does not exist!
####################
You are not the author of the comment you are trying to remove!
####################
--USER pesho--
Motorcycle:
Make: Kawasaki
Model: Z
Wheels: 2
Price: $9999
Category: Race
--COMMENTS--
Amazing speed and handling!
User: pesho
I like this one! It is faster than all the rest!
User: gosho
--COMMENTS--
Car:
Make: Opel
Model: Vectra
Wheels: 4
Price: $5000
Seats: 5
--NO COMMENTS--
Car:
Make: Mazda
Model: 6
Wheels: 4
Price: $10000
Seats: 5
--NO COMMENTS--
Motorcycle:
Make: Suzuki
Model: V-Strom
Wheels: 2
Price: $7500
Category: CityEnduro
--NO COMMENTS--
Car:
Make: BMW
Model: Z3
Wheels: 4
Price: $11200
Seats: 2
--NO COMMENTS--
####################
You logged out!
####################
User pesho successfully logged in!
####################
pesho added comment successfully!
####################
You logged out!
####################
User ivancho successfully logged in!
####################
ivancho added comment successfully!
####################
You logged out!
####################
User pesho successfully logged in!
####################
pesho added comment successfully!
####################
--USER pesho--
Motorcycle:
Make: Kawasaki
Model: Z
Wheels: 2
Price: $9999
Category: Race
--COMMENTS--
Amazing speed and handling!
User: pesho
I like this one! It is faster than all the rest!
User: gosho
I dream of having this one one day.
User: pesho
--COMMENTS--
Car:
Make: Opel
Model: Vectra
Wheels: 4
Price: $5000
Seats: 5
--NO COMMENTS--
Car:
Make: Mazda
Model: 6
Wheels: 4
Price: $10000
Seats: 5
--COMMENTS--
What is the mileage on it?
User: ivancho
This one passed my by on the highway today. So pretty!
User: pesho
--COMMENTS--
Motorcycle:
Make: Suzuki
Model: V-Strom
Wheels: 2
Price: $7500
Category: CityEnduro
--NO COMMENTS--
Car:
Make: BMW
Model: Z3
Wheels: 4
Price: $11200
Seats: 2
--NO COMMENTS--
####################
--USER gosho--
Motorcycle:
Make: Suzuki
Model: GSXR1000
Wheels: 2
Price: $8000
Category: Racing
--NO COMMENTS--
Car:
Make: Skoda
Model: Fabia
Wheels: 4
Price: $2000
Seats: 5
--NO COMMENTS--
Car:
Make: BMW
Model: 535i
Wheels: 4
Price: $7200
Seats: 5
--NO COMMENTS--
Motorcycle:
Make: Honda
Model: Hornet600
Wheels: 2
Price: $4150
Category: Race
--NO COMMENTS--
Car:
Make: Mercedes
Model: S500L
Wheels: 4
Price: $15000
Seats: 5
--NO COMMENTS--
Car:
Make: Opel
Model: Zafira
Wheels: 4
Price: $8000
Seats: 5
--NO COMMENTS--
Car:
Make: Opel
Model: Zafira
Wheels: 4
Price: $7450
Seats: 5
--NO COMMENTS--
Truck:
Make: Volvo
Model: FH4
Wheels: 8
Price: $11800
Weight Capacity: 40t
--NO COMMENTS--
####################
--USER ivancho--
--NO VEHICLES--
####################
You logged out!
####################
User gosho successfully logged in!
####################
gosho removed comment successfully!
####################
--USER pesho--
Motorcycle:
Make: Kawasaki
Model: Z
Wheels: 2
Price: $9999
Category: Race
--COMMENTS--
Amazing speed and handling!
User: pesho
I dream of having this one one day.
User: pesho
--COMMENTS--
Car:
Make: Opel
Model: Vectra
Wheels: 4
Price: $5000
Seats: 5
--NO COMMENTS--
Car:
Make: Mazda
Model: 6
Wheels: 4
Price: $10000
Seats: 5
--COMMENTS--
What is the mileage on it?
User: ivancho
This one passed my by on the highway today. So pretty! User: pesho
--COMMENTS--
Motorcycle:
Make: Suzuki
Model: V-Strom
Wheels: 2
Price: $7500
Category: CityEnduro
--NO COMMENTS--
Car:
Make: BMW
Model: Z3
Wheels: 4
Price: $11200
Seats: 2
--NO COMMENTS--
####################
You logged out!
####################
User pesho successfully logged in!
####################
pesho removed vehicle successfully!
####################
--USER pesho--
Car:
Make: Opel
Model: Vectra
Wheels: 4
Price: $5000
Seats: 5
--NO COMMENTS--
Car:
Make: Mazda
Model: 6
Wheels: 4
Price: $10000
Seats: 5
--COMMENTS--
What is the mileage on it?
User: ivancho
This one passed my by on the highway today. So pretty!
User: pesho
--COMMENTS--
Motorcycle:
Make: Suzuki
Model: V-Strom
Wheels: 2
Price: $7500
Category: CityEnduro
--NO COMMENTS--
Car:
Make: BMW
Model: Z3
Wheels: 4
Price: $11200
Seats: 2
--NO COMMENTS--
####################

```