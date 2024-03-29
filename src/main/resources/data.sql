-- INSERT PRODUCTS DATA
INSERT INTO product (product_id, category, brand) VALUES ('BG-419110951', 'Babies', 'Girlds');
INSERT INTO product (product_id, category, brand) VALUES ('BG-419110952', 'Babies', 'Girlds');
INSERT INTO product (product_id, category, brand) VALUES ('BG-419110953', 'Babies', 'Girlds');
INSERT INTO product (product_id, category, brand) VALUES ('BB-2144746855', 'Babies', 'Babyom');
INSERT INTO product (product_id, category, brand) VALUES ('BB-2144746856', 'Babies', 'Babyom');
INSERT INTO product (product_id, category, brand) VALUES ('BB-2144746857', 'Babies', 'Babyom');
INSERT INTO product (product_id, category, brand) VALUES ('BM-1173639537', 'Babies', 'Mommers');
INSERT INTO product (product_id, category, brand) VALUES ('BM-1173639538', 'Babies', 'Mommers');
INSERT INTO product (product_id, category, brand) VALUES ('BM-1173639539', 'Babies', 'Mommers');
INSERT INTO product (product_id, category, brand) VALUES ('BC-989301223', 'Babies', 'Childer');
INSERT INTO product (product_id, category, brand) VALUES ('BC-989301224', 'Babies', 'Childer');
INSERT INTO product (product_id, category, brand) VALUES ('BC-989301225', 'Babies', 'Childer');
INSERT INTO product (product_id, category, brand) VALUES ('MM-749337358', 'Milk', 'Milkcask');
INSERT INTO product (product_id, category, brand) VALUES ('MM-749337359', 'Milk', 'Milkcask');
INSERT INTO product (product_id, category, brand) VALUES ('MM-749337360', 'Milk', 'Milkcask');
INSERT INTO product (product_id, category, brand) VALUES ('MJ-373746709', 'Milk', 'Juice');
INSERT INTO product (product_id, category, brand) VALUES ('MJ-373746710', 'Milk', 'Juice');
INSERT INTO product (product_id, category, brand) VALUES ('MJ-373746711', 'Milk', 'Juice');
INSERT INTO product (product_id, category, brand) VALUES ('MD-543564695', 'Milk', 'Dairylounge');
INSERT INTO product (product_id, category, brand) VALUES ('MD-543564696', 'Milk', 'Dairylounge');
INSERT INTO product (product_id, category, brand) VALUES ('MD-543564697', 'Milk', 'Dairylounge');
INSERT INTO product (product_id, category, brand) VALUES ('MB-2093193397', 'Milk', 'Berrycow');
INSERT INTO product (product_id, category, brand) VALUES ('MB-2093193398', 'Milk', 'Berrycow');
INSERT INTO product (product_id, category, brand) VALUES ('MB-2093193399', 'Milk', 'Berrycow');
INSERT INTO product (product_id, category, brand) VALUES ('ST-348265157', 'Sports', 'Trand');
INSERT INTO product (product_id, category, brand) VALUES ('ST-348265158', 'Sports', 'Trand');
INSERT INTO product (product_id, category, brand) VALUES ('ST-348265159', 'Sports', 'Trand');
INSERT INTO product (product_id, category, brand) VALUES ('SB-51995577', 'Sports', 'Ballshop');
INSERT INTO product (product_id, category, brand) VALUES ('SB-51995578', 'Sports', 'Ballshop');
INSERT INTO product (product_id, category, brand) VALUES ('SB-51995579', 'Sports', 'Ballshop');
INSERT INTO product (product_id, category, brand) VALUES ('SC-860550237', 'Sports', 'Crumyard');
INSERT INTO product (product_id, category, brand) VALUES ('SC-860550238', 'Sports', 'Crumyard');
INSERT INTO product (product_id, category, brand) VALUES ('SC-860550239', 'Sports', 'Crumyard');
INSERT INTO product (product_id, category, brand) VALUES ('SS-1529984359', 'Sports', 'Sportf');
INSERT INTO product (product_id, category, brand) VALUES ('SS-1529984360', 'Sports', 'Sportf');
INSERT INTO product (product_id, category, brand) VALUES ('SS-1529984361', 'Sports', 'Sportf');
INSERT INTO product (product_id, category, brand) VALUES ('VV-1280808854', 'Vegan', 'Veganoid');
INSERT INTO product (product_id, category, brand) VALUES ('VV-1280808855', 'Vegan', 'Veganoid');
INSERT INTO product (product_id, category, brand) VALUES ('VV-1280808856', 'Vegan', 'Veganoid');
INSERT INTO product (product_id, category, brand) VALUES ('VT-246442909', 'Vegan', 'Tarcrop');
INSERT INTO product (product_id, category, brand) VALUES ('VT-246442910', 'Vegan', 'Tarcrop');
INSERT INTO product (product_id, category, brand) VALUES ('VT-246442911', 'Vegan', 'Tarcrop');
INSERT INTO product (product_id, category, brand) VALUES ('VB-1890577306', 'Vegan', 'Beanut');
INSERT INTO product (product_id, category, brand) VALUES ('VB-1890577307', 'Vegan', 'Beanut');
INSERT INTO product (product_id, category, brand) VALUES ('VB-1890577308', 'Vegan', 'Beanut');
INSERT INTO product (product_id, category, brand) VALUES ('VA-1329167330', 'Vegan', 'Avocadow');
INSERT INTO product (product_id, category, brand) VALUES ('VA-1329167331', 'Vegan', 'Avocadow');
INSERT INTO product (product_id, category, brand) VALUES ('VA-1329167332', 'Vegan', 'Avocadow');

-- INSERT SHOPPERS
INSERT INTO shopper (shopper_id, shopper_name) VALUES ('S-1000', 'Shopper - S-1000');
INSERT INTO shopper (shopper_id, shopper_name) VALUES ('S-1001', 'Shopper - S-1001');
INSERT INTO shopper (shopper_id, shopper_name) VALUES ('S-1002', 'Shopper - S-1002');
INSERT INTO shopper (shopper_id, shopper_name) VALUES ('S-1003', 'Shopper - S-1003');
INSERT INTO shopper (shopper_id, shopper_name) VALUES ('S-1004', 'Shopper - S-1004');

-- INSERT SHELFS
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1000', 'MB-2093193398', 31.089209569320897);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1000', 'VV-1280808856', 55.16626010671777);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1000', 'MD-543564697', 73.01492966268303);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1000', 'BB-2144746855', 4.465418091552332);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1000', 'MB-2093193397', 81.86596372052234);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1000', 'SC-860550238', 80.39179367642213);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1000', 'BG-419110952', 17.06951788069343);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1000', 'BM-1173639537', 67.02308880778921);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1000', 'MJ-373746710', 5.732323263667915);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1000', 'SS-1529984359', 82.6173683756812);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1000', 'MJ-373746711', 83.6325837366619);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1000', 'BC-989301224', 6.778058627746741);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1000', 'BB-2144746857', 85.39314011525776);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1000', 'VA-1329167330', 67.76365858050977);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1000', 'SB-51995577', 46.014451739635916);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1001', 'MD-543564695', 64.9399444667783);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1001', 'BB-2144746857', 53.57797793220851);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1001', 'VT-246442909', 21.288534107744482);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1001', 'VA-1329167330', 27.014437875539265);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1001', 'SS-1529984359', 62.1324134409292);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1001', 'BM-1173639539', 44.137367556050236);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1001', 'MM-749337360', 6.856912727184749);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1001', 'ST-348265157', 39.775934624141605);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1001', 'VB-1890577308', 96.8131613220743);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1001', 'BG-419110953', 4.430050876459301);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1001', 'VT-246442911', 99.38024632323383);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1001', 'VV-1280808854', 2.4611321887394677);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1001', 'MM-749337358', 24.346224227541345);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1001', 'MM-749337359', 58.574240950900524);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1001', 'MD-543564696', 37.505474308360355);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1002', 'VA-1329167330', 19.492734899351294);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1002', 'BB-2144746855', 52.970581137195005);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1002', 'SB-51995577', 71.96790001671006);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1002', 'SC-860550238', 43.95637045922845);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1002', 'ST-348265158', 63.53588332610439);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1002', 'VB-1890577306', 28.318408103977355);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1002', 'MD-543564697', 96.8270084353957);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1002', 'VV-1280808855', 9.605985097277658);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1002', 'MM-749337358', 51.47881070494537);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1002', 'MB-2093193399', 97.79320043226103);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1002', 'BC-989301223', 22.951332705537688);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1002', 'BG-419110953', 42.45475417967195);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1002', 'MD-543564695', 81.82907115868066);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1002', 'SS-1529984359', 20.116106438128845);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1002', 'MB-2093193398', 91.64193020313606);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1003', 'MM-749337359', 9.285784508856453);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1003', 'VB-1890577308', 42.69865877013647);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1003', 'BB-2144746855', 51.652597645133206);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1003', 'VB-1890577306', 53.549240984667016);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1003', 'BG-419110952', 60.062975207288915);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1003', 'BM-1173639539', 63.844337249273266);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1003', 'SC-860550238', 12.045177782886729);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1003', 'MM-749337360', 62.348573774809225);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1003', 'VT-246442911', 19.421445338673916);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1003', 'SB-51995578', 50.23350517638963);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1003', 'BC-989301225', 76.10965733312545);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1003', 'BB-2144746856', 3.668377020508895);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1003', 'BM-1173639537', 65.53309644268158);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1003', 'MM-749337358', 99.01865852867185);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1003', 'BC-989301223', 1.0846539140113576);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'BM-1173639537', 87.44404516029063);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'VB-1890577307', 82.79179867042755);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'VT-246442909', 73.9644416081247);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'BB-2144746855', 69.42747936618181);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'VB-1890577308', 25.81144046082404);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'ST-348265157', 80.35799873926712);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'MB-2093193397', 38.30020871138008);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'MD-543564696', 53.008430263420216);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'MJ-373746709', 38.108616670630326);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'VA-1329167332', 31.61708483693215);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'SS-1529984359', 36.0226464541305);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'MB-2093193399', 66.72664648565359);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'BC-989301225', 2.5494342826014704);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'MD-543564695', 91.11862453341534);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'SC-860550237', 18.570109269156355);
INSERT INTO shelf (shopper_id, product_id, relevancy_score) VALUES ('S-1004', 'SC-860550237', 30.737805376096695);