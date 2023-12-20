drop database if exists cricbuzz;

create database if not exists cricbuzz;

use cricbuzz;

CREATE TABLE IF NOT EXISTS post_type (
    id INT AUTO_INCREMENT,
    name VARCHAR(10) NOT NULL,
    CONSTRAINT post_type__id_pk PRIMARY KEY (id),
    CONSTRAINT post_type__name_ak UNIQUE KEY (name)
);

CREATE TABLE IF NOT EXISTS post_summary (
    id INT AUTO_INCREMENT,
    author_name VARCHAR(20),
    heading_1 VARCHAR(100) NOT NULL,
    heading_2 VARCHAR(100),
    heading_3 VARCHAR(100),
    preview_text VARCHAR(200),
    preview_image_link TEXT NOT NULL,
    post_link TEXT NOT NULL,
    CONSTRAINT post_summary__id_pk PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS post (
    id INT AUTO_INCREMENT,
    post_type_id INT NOT NULL,
    post_summary_id INT NOT NULL,
    view_count INT DEFAULT 0,
    creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    CONSTRAINT post__id_pk PRIMARY KEY (id),
    CONSTRAINT post__post_type_id_fk FOREIGN KEY (post_type_id)
        REFERENCES post_type (id),
    CONSTRAINT post__post_summary_id_fk FOREIGN KEY (post_summary_id)
        REFERENCES post_summary (id)
);

INSERT INTO `post_type` (`name`) VALUES ('VIDEO'), ('EDITORIAL');

-- Insert data into post_summary table
INSERT INTO post_summary (author_name, heading_1, heading_2, heading_3, preview_text, preview_image_link, post_link)
VALUES
    ('Author 1', 'Post 1 Heading 1', 'Post 1 Heading 2', 'Post 1 Heading 3', 'Preview text for post 1.', 'https://example.com/image1.jpg', 'https://example.com/post1.html'),
    ('Author 2', 'Post 2 Heading 1', 'Post 2 Heading 2', 'Post 2 Heading 3', 'Preview text for post 2.', 'https://example.com/image2.jpg', 'https://example.com/post2.html'),
    ('Author 3', 'Post 3 Heading 1', 'Post 3 Heading 2', 'Post 3 Heading 3', 'Preview text for post 3.', 'https://example.com/image3.jpg', 'https://example.com/post3.html'),
    ('Author 4', 'Post 4 Heading 1', 'Post 4 Heading 2', 'Post 4 Heading 3', 'Preview text for post 4.', 'https://example.com/image4.jpg', 'https://example.com/post4.html'),
    ('Author 5', 'Post 5 Heading 1', 'Post 5 Heading 2', 'Post 5 Heading 3', 'Preview text for post 5.', 'https://example.com/image5.jpg', 'https://example.com/post5.html'),
    ('Author 6', 'Post 6 Heading 1', 'Post 6 Heading 2', 'Post 6 Heading 3', 'Preview text for post 6.', 'https://example.com/image6.jpg', 'https://example.com/post6.html'),
    ('Author 7', 'Post 7 Heading 1', 'Post 7 Heading 2', 'Post 7 Heading 3', 'Preview text for post 7.', 'https://example.com/image7.jpg', 'https://example.com/post7.html'),
    ('Author 8', 'Post 8 Heading 1', 'Post 8 Heading 2', 'Post 8 Heading 3', 'Preview text for post 8.', 'https://example.com/image8.jpg', 'https://example.com/post8.html'),
    ('Author 9', 'Post 9 Heading 1', 'Post 9 Heading 2', 'Post 9 Heading 3', 'Preview text for post 9.', 'https://example.com/image9.jpg', 'https://example.com/post9.html'),
    ('Author 10', 'Post 10 Heading 1', 'Post 10 Heading 2', 'Post 10 Heading 3', 'Preview text for post 10.', 'https://example.com/image10.jpg', 'https://example.com/post10.html');

-- Insert data into post table
INSERT INTO post (post_type_id, post_summary_id, view_count, creation_date)
VALUES
    (1, 1, 100, '2023-01-01 12:00:00'),
    (2, 2, 50, '2023-01-02 14:30:00'),
    (1, 3, 75, '2023-01-03 16:45:00'),
    (2, 4, 120, '2023-01-04 18:20:00'),
    (1, 5, 90, '2023-01-05 10:10:00'),
    (2, 6, 60, '2023-01-06 08:30:00'),
    (1, 7, 110, '2023-01-07 22:15:00'),
    (2, 8, 80, '2023-01-08 11:40:00'),
    (1, 9, 95, '2023-01-09 19:05:00'),
    (2, 10, 70, '2023-01-10 15:55:00');


