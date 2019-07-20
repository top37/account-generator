/*
Navicat MySQL Data Transfer

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for accountcd
-- ----------------------------
DROP TABLE IF EXISTS `accountcd`;
CREATE TABLE `accountcd` (
  `A` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '数据主键',
  `B` varchar(64) DEFAULT NULL COMMENT '记账码',
  `C` varchar(64) DEFAULT NULL COMMENT '序号',
  `D` varchar(64) DEFAULT NULL COMMENT '借/贷',
  `E` varchar(64) DEFAULT NULL COMMENT '科目编码',
  `F` varchar(64) DEFAULT NULL COMMENT '科目名称',
  PRIMARY KEY (`A`)
) ENGINE=InnoDB AUTO_INCREMENT=915 DEFAULT CHARSET=utf8 COMMENT='会计记账码文档整理';

-- ----------------------------
-- Table structure for accountin
-- ----------------------------
DROP TABLE IF EXISTS `accountin`;
CREATE TABLE `accountin` (
  `A` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '数据主键',
  `B` varchar(64) DEFAULT NULL COMMENT '类型',
  `C` varchar(64) DEFAULT NULL COMMENT '序号',
  `D` varchar(64) DEFAULT NULL COMMENT '业务场景',
  `E` varchar(64) DEFAULT NULL COMMENT '摘要',
  `F` varchar(64) DEFAULT NULL COMMENT '借/贷',
  `G` varchar(64) DEFAULT NULL COMMENT '科目编码',
  `H` varchar(64) DEFAULT NULL COMMENT '科目名称',
  `I` varchar(64) DEFAULT NULL COMMENT '辅助核算',
  `J` varchar(64) DEFAULT NULL COMMENT '核算编码',
  `K` varchar(64) DEFAULT NULL COMMENT '凭证类型',
  `L` varchar(64) DEFAULT NULL COMMENT '生成凭证公司',
  PRIMARY KEY (`A`)
) ENGINE=InnoDB AUTO_INCREMENT=287 DEFAULT CHARSET=utf8 COMMENT='会计需求文档整理';

-- ----------------------------
-- Table structure for accountnew
-- ----------------------------
DROP TABLE IF EXISTS `accountnew`;
CREATE TABLE `accountnew` (
  `B` varchar(64) DEFAULT NULL,
  `C` varchar(64) DEFAULT NULL,
  `D` varchar(64) DEFAULT NULL,
  `E` varchar(64) DEFAULT NULL,
  `F` varchar(64) DEFAULT NULL,
  `G` varchar(256) DEFAULT NULL,
  `H` varchar(64) DEFAULT NULL,
  `I` varchar(64) DEFAULT NULL,
  `J` varchar(64) DEFAULT NULL,
  `K` varchar(64) DEFAULT NULL,
  `L` varchar(64) DEFAULT NULL,
  `M` varchar(64) DEFAULT NULL,
  `N` varchar(64) DEFAULT NULL,
  `O` varchar(64) DEFAULT NULL,
  `P` varchar(64) DEFAULT NULL,
  `Q` varchar(64) DEFAULT NULL,
  `R` varchar(64) DEFAULT NULL,
  `S` varchar(64) DEFAULT NULL,
  `T` varchar(64) DEFAULT NULL,
  `U` varchar(64) DEFAULT NULL,
  `V` varchar(64) DEFAULT NULL,
  `W` varchar(64) DEFAULT NULL,
  `X` varchar(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会计模板映射表';
