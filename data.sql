CREATE TABLE `teamlab`.`todo` (
  `id` BIGINT NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `deadline` DATE NULL,
  `created_at` DATE NULL,
  `finished` BOOLEAN NOT NULL DEFAULT false,
  PRIMARY KEY (`id`));

INSERT INTO teamlab.todo (`id`, `name`, `deadline`, `created_at`, `finished`) VALUES (1, 'テスト', '2019-08-09', '2019-08-06', false);
