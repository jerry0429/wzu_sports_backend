ALTER TABLE `wzsport`.`wzsport_running_activity` ADD COLUMN `ended` tinyint(1) UNSIGNED NOT NULL DEFAULT 0 AFTER `qualified`;
UPDATE `wzsport_running_activity` SET `wzsport_running_activity`.`ended` = 1;
ALTER TABLE `wzsport`.`wzsport_running_activity` CHANGE COLUMN `distance` `distance` int(11) NOT NULL DEFAULT 0, CHANGE COLUMN `cost_time` `cost_time` int(11) NOT NULL DEFAULT 0, CHANGE COLUMN `target_time` `target_time` int(11) NOT NULL DEFAULT 0, CHANGE COLUMN `start_time` `start_time` datetime DEFAULT NULL, CHANGE COLUMN `calories_consumed` `calories_consumed` int(11) NOT NULL DEFAULT 0, CHANGE COLUMN `qualified` `qualified` tinyint(1) UNSIGNED NOT NULL DEFAULT 0;