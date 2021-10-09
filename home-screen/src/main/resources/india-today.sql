CREATE TABLE banner (
    id int NOT NULL,
    name varchar(50) NOT NULL,
    landing_url varchar(200),
    order_type varchar(50),
    PRIMARY KEY (id)
);

CREATE TABLE banner_meta_data (
    id int NOT NULL,
    product_code varchar(10) NOT NULL,
    product_name varchar(50),
    professional_slug varchar(100),
    banner_id int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (banner_id) REFERENCES banner(id)
);

CREATE TABLE banner_images (
    id int NOT NULL,
    image_url varchar(200),
    image_type varchar(30),
    banner_id int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (banner_id) REFERENCES banner(id)
);

-----------------------------------------------------------------

CREATE TABLE reports (
    id int NOT NULL,
    `name` varchar(50) NOT NULL,
    product_code varchar(10),
    image_url varchar(50),
    `description` varchar(300),
    price int NOT NULL,
    offer_price int NOT NULL,
    PRIMARY KEY (id)
);
CREATE TABLE indepth_points (
    id int NOT NULL,
    point_value varchar(100),
    reports_id int NOT NULL,
    FOREIGN KEY (reports_id) REFERENCES reports(id)
);


CREATE TABLE available_languages (
    id int NOT NULL,
    lang_value varchar(100) DEFAULT NULL,
    reports_id int NOT NULL,
    FOREIGN KEY (reports_id) REFERENCES reports(id)
);

------------------------------


CREATE TABLE horoscopes (
    id int NOT NULL,
    name varchar(50) NOT NULL,
    date varchar(50),
    img varchar(50),
    url_slug varchar(100),
    PRIMARY KEY (id)
);

CREATE TABLE images_size (
    id int not null,
    image_url varchar(200),
    image_type ENUM ('small','medium','large'),
    horoscopes_id int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (horoscopes_id) REFERENCES horoscopes(id)
);

--------------------------------------------
CREATE TABLE questions (
    id int NOT NULL,
    `name` varchar(50) NOT NULL,
    `description` varchar(300),
    price DECIMAL(13,2) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE suggestions (
    id int NOT NULL,
    question varchar(300),
	questions_id int NOT NULL,
    PRIMARY KEY (id),
	FOREIGN KEY (questions_id) REFERENCES questions(id)
);

--------

CREATE TABLE astro (
    id int NOT NULL,
    url_slug varchar(50) NOT NULL,
    name_prefix varchar(50),
    first_name varchar(50),
    last_name varchar(50),
    about_me varchar(200),
    proflie_pic_url varchar(200),
    experience DECIMAL(13,2) NOT NULL,
    is_on_call boolean not null,
    minimum_call_duration int not null,
    minimum_call_duration_charges DECIMAL(8,1) NOT NULL,
    additional_per_minute_charges DECIMAL(8,1) NOT NULL,
    is_available boolean not null,
    rating int default null,
    PRIMARY KEY (id)
);

CREATE TABLE astro_images (
    id int not null,
    image_url varchar(200),
    image_type ENUM ('small','medium','large'),
    astro_id int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (astro_id) REFERENCES astro(id)
);

CREATE TABLE languages (
    id int not null,
    lang_value varchar(20) not null,
    astro_id int not null,
    FOREIGN KEY (astro_id) REFERENCES astro(id)
);

CREATEquestions TABLE skills (
    id int not null,
    skill_value varchar(20) not null,
    astro_id int not null,
    FOREIGN KEY (astro_id) REFERENCES astro(id)
);

CREATE TABLE astro_images (
    id int NOT NULL,
    image_url varchar(200),
    image_type ENUM ('medium','large'),
    astro_id int NOT NULL,
    FOREIGN KEY (astro_id) REFERENCES astro(id)
);

CREATE TABLE availability (
    id int NOT NULL,
    days varchar(100),
    astro_id int NOT NULL,
    FOREIGN KEY (astro_id) REFERENCES astro(id)
);


CREATE TABLE slot (
    to_format varchar(10),
    from_format varchar(10),
    `from` int NOT NULL,
    `to` int NOT NULL,
    astro_id int NOT NULL,
    FOREIGN KEY (astro_id) REFERENCES astro(id)
);



















