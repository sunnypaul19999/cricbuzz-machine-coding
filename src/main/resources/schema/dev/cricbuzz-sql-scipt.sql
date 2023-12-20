DROP DATABASE IF EXISTS cricbuzz;

CREATE DATABASE IF NOT EXISTS cricbuzz;

use cricbuzz;

CREATE TABLE premium_plan (
    id INT,
    plan_name VARCHAR(50) NOT NULL,
    price DECIMAL(10 , 2 ) NOT NULL,
    validity_days INT NOT NULL,
    description TEXT,
    CONSTRAINT premium_plan__plan_name_ak UNIQUE KEY (plan_name),
    CONSTRAINT post_summary__id_pk PRIMARY KEY (id)
);


CREATE TABLE premium_plan_feature (
    id INT,
    premium_plan_id INT,
    feature_name VARCHAR(100) NOT NULL,
    CONSTRAINT premium_plan_feature__id_pk PRIMARY KEY (id),
    CONSTRAINT premium_plan_feature__id_fk FOREIGN KEY (premium_plan_id)
        REFERENCES premium_plan (id)
);


CREATE TABLE IF NOT EXISTS post_type (
    id INT AUTO_INCREMENT,
    name VARCHAR(10) NOT NULL,
    CONSTRAINT post_type__id_pk PRIMARY KEY (id),
    CONSTRAINT post_type__name_ak UNIQUE KEY (name)
);


CREATE TABLE IF NOT EXISTS post (
    id INT AUTO_INCREMENT,
    post_type_id INT NOT NULL,
    view_count INT DEFAULT 0,
    creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    premium_plan_id INT NOT NULL,
    CONSTRAINT post__id_pk PRIMARY KEY (id),
    CONSTRAINT post__post_type_id_fk FOREIGN KEY (post_type_id)
        REFERENCES post_type (id),
    CONSTRAINT post__premium_plan_id_fk FOREIGN KEY (premium_plan_id)
        REFERENCES premium_plan (id)
);


CREATE TABLE IF NOT EXISTS post_summary (
    id INT AUTO_INCREMENT,
    post_id INT,
    author_name VARCHAR(20),
    heading_1 VARCHAR(100) NOT NULL,
    heading_2 VARCHAR(100),
    heading_3 VARCHAR(100),
    preview_text VARCHAR(200),
    preview_image_link TEXT NOT NULL,
    post_link TEXT NOT NULL,
    CONSTRAINT post_summary__id_pk PRIMARY KEY (id),
    CONSTRAINT post_summary__post_id_ak UNIQUE KEY (post_id),
    CONSTRAINT post_summary__post_id_fk FOREIGN KEY (post_id)
        REFERENCES post (id)
        ON DELETE CASCADE
);


-- Insert sample data into premium_plan table
INSERT INTO premium_plan (id, plan_name, price, validity_days, description) VALUES
    (1, 'Basic Plan', 9.99, 30, 'Access to basic cricket content'),
    (2, 'Pro Plan', 19.99, 60, 'Enhanced features for cricket enthusiasts'),
    (3, 'Premium Plan', 29.99, 90, 'Exclusive access to premium cricket content');

-- Insert sample data into premium_plan_feature table
INSERT INTO premium_plan_feature (id, premium_plan_id, feature_name) VALUES
    (1, 1, 'Live Match Streaming'),
    (2, 1, 'News Updates'),
    (3, 2, 'Match Analysis'),
    (4, 2, 'HD Video Playback'),
    (5, 3, 'Exclusive Interviews'),
    (6, 3, 'Access to Archives');

-- Insert sample data into post_type table
INSERT INTO post_type (name) VALUES 
    ('VIDEO'), 
    ('EDITORIAL');

-- Insert sample data into post table
INSERT INTO post (post_type_id, premium_plan_id, view_count, creation_date) VALUES
    (1, 1, 1000, '2023-01-15 10:30:00'),
    (2, 2, 500, '2023-02-02 14:45:00'),
    (1, 3, 1200, '2023-03-10 18:20:00'),
    (2, 1, 800, '2023-04-05 12:15:00'),
    (1, 2, 1500, '2023-05-20 09:45:00'),
    (2, 3, 700, '2023-06-08 16:00:00'),
    (1, 1, 900, '2023-07-12 11:10:00'),
    (2, 2, 600, '2023-08-28 20:30:00'),
    (1, 3, 1100, '2023-09-14 13:40:00'),
    (2, 1, 750, '2023-10-03 15:00:00');


-- Insert sample data into post_summary table
INSERT INTO post_summary (post_id, author_name, heading_1, heading_2, heading_3, preview_text, preview_image_link, post_link) VALUES
    (1, 'John Doe', 'Exciting Match Highlights', 'Best Moments', NULL, 'Catch the highlights of the thrilling match between Teams A and B.', 'image1.jpg', 'video_link1'),
    (2, 'Jane Smith', 'Cricket Editorial: Player Performances', 'In-Depth Analysis', NULL, 'Analyze the performance of key players in recent cricket matches.', 'image2.jpg', 'editorial_link1'),
    (3, 'Sam Johnson', 'Live Streaming: Team A vs Team B', 'Full Match Coverage', NULL, 'Watch the live streaming of the exciting cricket match between Teams A and B.', 'image3.jpg', 'video_link2'),
    (4, 'Emily White', 'Expert Commentary: Cricket Strategies', 'Insider Insights', NULL, 'Get insights into the strategies adopted by cricket teams in recent matches.', 'image4.jpg', 'editorial_link2'),
    (5, 'Chris Green', 'Cricket Moments: Best Catches', 'Top Catches Compilation', NULL, 'Relive the best moments with a compilation of amazing catches from recent cricket matches.', 'image5.jpg', 'video_link3'),
    (6, 'Sophia Brown', 'Exclusive Interview: Star Player', 'Behind the Scenes', NULL, 'An exclusive interview with a star cricket player, revealing behind-the-scenes stories.', 'image6.jpg', 'editorial_link3'),
    (7, 'Alex Taylor', 'Live Match Streaming: Team C vs Team D', 'Full Match Experience', NULL, 'Experience the live streaming of the intense cricket match between Teams C and D.', 'image7.jpg', 'video_link4'),
    (8, 'Oliver Davis', 'Cricket Editorial: Emerging Talents', 'Future Stars', NULL, 'Explore the rising talents and future stars in the world of cricket.', 'image8.jpg', 'editorial_link4'),
    (9, 'Mia Wilson', 'Cricket Moments: Memorable Sixes', 'Sixes Compilation', NULL, 'Enjoy a compilation of memorable sixes hit by cricket players in various matches.', 'image9.jpg', 'video_link5'),
    (10, 'Ethan Miller', 'In-Depth Analysis: Cricket Strategies', 'Tactical Breakdown', NULL, 'A detailed analysis breaking down the strategic moves and tactics used by cricket teams.', 'image10.jpg', 'editorial_link5');

