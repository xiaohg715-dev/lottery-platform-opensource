CREATE DATABASE IF NOT EXISTS lottery DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE lottery;

-- User table
CREATE TABLE IF NOT EXISTS `user` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(50) NOT NULL COMMENT 'Username',
  `phone` VARCHAR(20) NOT NULL COMMENT 'Phone number',
  `password` VARCHAR(255) NOT NULL COMMENT 'Password',
  `balance` DECIMAL(10,2) DEFAULT 0.00 COMMENT 'Account balance',
  `status` TINYINT DEFAULT 1 COMMENT '1:active 0:disabled',
  `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `update_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_phone` (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='User table';

-- Football match table
CREATE TABLE IF NOT EXISTS `football_match` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `match_no` VARCHAR(50) NOT NULL COMMENT 'Match number',
  `home_team` VARCHAR(100) NOT NULL COMMENT 'Home team',
  `away_team` VARCHAR(100) NOT NULL COMMENT 'Away team',
  `league` VARCHAR(100) COMMENT 'League name',
  `match_time` DATETIME NOT NULL COMMENT 'Match time',
  `home_odds` VARCHAR(10) COMMENT 'Home win odds',
  `draw_odds` VARCHAR(10) COMMENT 'Draw odds',
  `away_odds` VARCHAR(10) COMMENT 'Away win odds',
  `result` VARCHAR(10) COMMENT 'Match result',
  `status` VARCHAR(20) DEFAULT 'PENDING' COMMENT 'PENDING,FINISHED,CANCELLED',
  `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_match_no` (`match_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Football match table';

-- Lottery order table
CREATE TABLE IF NOT EXISTS `lottery_order` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `order_no` VARCHAR(50) NOT NULL COMMENT 'Order number',
  `user_id` BIGINT NOT NULL COMMENT 'User ID',
  `lottery_type` VARCHAR(50) NOT NULL COMMENT 'Lottery type',
  `bet_content` TEXT COMMENT 'Bet content',
  `bet_count` INT NOT NULL COMMENT 'Bet count',
  `bet_amount` DECIMAL(10,2) NOT NULL COMMENT 'Bet amount',
  `odds` DECIMAL(10,2) COMMENT 'Odds',
  `prize_amount` DECIMAL(10,2) DEFAULT 0.00 COMMENT 'Prize amount',
  `status` VARCHAR(20) DEFAULT 'PENDING' COMMENT 'PENDING,WIN,LOSE,CANCELLED',
  `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `update_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_order_no` (`order_no`),
  KEY `idx_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Lottery order table';

-- Insert demo data
INSERT INTO `football_match` (`match_no`, `home_team`, `away_team`, `league`, `match_time`, `home_odds`, `draw_odds`, `away_odds`, `status`) VALUES
('M001', 'Manchester United', 'Liverpool', 'Premier League', '2024-01-20 20:00:00', '2.1', '3.2', '3.5', 'PENDING'),
('M002', 'Barcelona', 'Real Madrid', 'La Liga', '2024-01-21 22:00:00', '1.8', '3.0', '4.2', 'PENDING'),
('M003', 'Bayern Munich', 'Dortmund', 'Bundesliga', '2024-01-22 21:30:00', '1.5', '3.8', '5.0', 'PENDING');
