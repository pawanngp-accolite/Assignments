create database taxi_management;
use taxi_management;

CREATE TABLE userdb
(
user_id int PRIMARY KEY,
user_name varchar(255)
);
select * from userdb;

CREATE TABLE vehicle
(
vehicle_id int PRIMARY KEY,
vehicle_name varchar(255),
vehicle_owner_name varchar(255)
);
CREATE TABLE driver
(
driver_id int PRIMARY KEY,
driver_name varchar(255),
 driver_phonr_number varchar(255)
);


CREATE TABLE ride
(
ride_id int PRIMARY KEY,
pickup_location varchar(50),
drop_location varchar(50),
payment decimal(10,2),
distance_covered  decimal(10,2),
driver_id int,
foreign key (driver_id) references driver(driver_id),
userid int,
foreign key (userid) references userdb(user_id),
vehicle_id int,
foreign key (vehicle_id) references vehicle(vehicle_id)



);
DROP TABLE ride;

insert into userdb(user_id,user_name)values(1,"pawan");
insert into vehicle(vehicle_id,vehicle_name,vehicle_owner_name)values(1,"indica","santhosh");
insert into driver(driver_id,driver_name,driver_phonr_number)values(1,"prathap","9911991191");
insert into ride(ride_id,pickup_location,drop_location,payment,distance_covered,driver_id,userid,vehicle_id)values(1,"basavnagudi","marthahalli",247.50,17.1,1,1,1);
insert into userdb(user_id,user_name)values(2,"ngp");
insert into vehicle(vehicle_id,vehicle_name,vehicle_owner_name)values(2,"indicaX","raj");
insert into driver(driver_id,driver_name,driver_phonr_number)values(2,"sundar","9292921212");
insert into ride(ride_id,pickup_location,drop_location,payment,distance_covered,driver_id,userid,vehicle_id)values(2,"koramangla","marthahalli",127.50,7.1,2,2,2);
CREATE VIEW RIDE_DETAILS AS (SELECT * FROM ride WHERE ride_id IS NOT NULL );
select * from ride;
select * from driver;
select * from vehicle;
select * from userdb;
select * from ride having payment > 100;
select * from ride left join driver on driver.driver_id=ride.ride_id where driver.driver_id=ride.ride_id;

select * from RIDE_DETAILS;  

