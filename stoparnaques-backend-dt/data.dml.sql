/*
 * DML = Data Manipulation Language
 * psql -h localhost -p 5432 -U postgres -d stoparnaques
 * \i data.dml.sql
 * \q
 */

//Tester les tables 


INSERT INTO categories (name)
VALUES ('Actualités'), ('Conseils');



INSERT INTO profiles (uuid, email)
	VALUES 
	('9ebc1fd9-f72f-46c8-9255-1e29b8f20ab9', 'toto@mail.com'),
	('6c44d264-1a04-49a3-b541-7579ece3e8a1', 'titi@mail.com'),
	('fe48b8f7-fb89-4934-bac5-e616af56df53', 'totota@mail.com'),
	('f41d4ee5-c1ec-4f0d-93ed-c7b58f2d3074', 'simplon@mail.com'),
	('25e0dc24-95e3-466f-a93d-2cee1c4a0169', 'manalben@mail.com');
	
	
INSERT INTO lawyers (lawyer_name, available, profile_id)
	VALUES 
	('Toto', false, (SELECT id FROM profiles WHERE email = 'toto@mail.com')),
	('Titi', true, (SELECT id FROM profiles WHERE email = 'titi@mail.com')),
	('totota', true, (SELECT id FROM profiles WHERE email = 'totota@mail.com')),
	('simplon', true, (SELECT id FROM profiles WHERE email = 'simplon@mail.com'));
	
	
INSERT INTO request (description,date_of_litige,litigation_id)
	VALUES
	('lorem ipsum blabla', '2022-05-19', (select l.id FROM litigations l where l.label = 'Autre')),
	('lorem ipsum blabla', '2022-05-21', (select l.id FROM litigations l where l.label = 'origine frauduleuse')),


INSERT INTO articles (title, subtitle, description, image_url, date_of_publication, category_id) 
	VALUES
('Ecommerce','Tuto déscryptage fiabilité du site marchand','Ce nest pas parce que vous nachetez pas via un site proposé par un influenceur que vous êtes à labri des arnaques Amazon a déposé plainte contre des influenceurs de réseaux sociaux qu’elle accuse d’avoir promu la vente d’articles contrefaits. Les articles en question ont été référencés sur sa plateforme. Dans le cadre de cette poursuite judiciaire, Amazon a déposé plainte auprès du tribunal du district ouest de Washington explique le marketplace dans un communiqué de presse. Relayé par le site d’information Zdnet, le document a été rendu public il y a quelques jours et accuse une dizaine d’influenceurs et de professionnels d’avoir mis en œuvre des stratagèmes visant à promouvoir de faux produits de luxe auprès des internautes. En plus d’accuser de contrefaçon les 13 personnes physiques et morales ciblées par la plainte, le géant du e-commerce se dit être victime d’un acte de tromperie dont l’objectif était de duper son système de vérification. Parmi les accusés, il y a des personnalités d’Instagram, Facebook et TikTok.','assets/IMG/ampoule/conseils1.png','2022-05-19', (select c.id FROM categories c where c.name = 'Actualités')),
('Les réseaux sociaux','Les réseaux sociaux, paradis de la contrefaçon','Les réseaux sociaux peuvent constituer le vecteur du trafic de produits de contrefaçon,notamment en raison de la simplicité dutilisation de ces réseaux Certaines stars de téléréalité enchaînent les bad buzz. Selon le journal Le Monde, un groupe dinfluenceurs basés à Dubaï est la cible dune enquête menée par le parquet de Paris, lAutorité des marchés financiers (AMF) et la Direction générale de la concurrence, de la consommation et de la répression des fraudes (DGCCRF)  Il leur est reproché dinciter les membres de leur communauté à placer leur argent dans des produits financiers sans en indiquer les risques. Notamment le cas entre autres de Laurent « Billionnaire » accusé davoir fait la promotion dun site de trading en dépit de la loi Sapin 2 de décembre 2016 qui interdit la publicité pour des produits financiers complexes Le profil de cet influenceur a été supprimé du réseau social Snapchat alors quil comptait plusieurs millions d’abonnés, mais il n’est pas à labri de sanctions supplémentaires. Dautres influenceuses, comme Milla Jasmine ou Maeva Ghennam, ont vu leur compte Instagram momentanément suspendu. Quant à Nabilla Vergara, elle a été condamnée lété dernier à une amende de 20 000 € pour des faits similaires après avoir diffusé en 2018 une publicité pour un site de trading et de bitcoin sans mentionner que ce partenariat était rémunéré.','assets/IMG/ampoule/conseils1.png','2022-03-29', (select c.id FROM categories c where c.name = 'Actualités')),
('Influenceur et justice', 'Des influenceurs dans le collimateur de la justice!','Le trading et la promotion sur les réseaux sociaux ne font pas toujours bon ménage. Plusieurs figures de la téléréalité font lobjet de poursuites après avoir vanté les mérites de sites peu scrupuleux.','assets/IMG/ampoule/conseils1.png','2022-03-13', (select c.id FROM categories c where c.name = 'Actualités')),
('Nos conseils à suivre', 'Nos 10 conseils', 'Beaucoup d’internautes ont eu des soucis après avoir suivi les conseils dachat de personnalités en vue sur les réseaux sociaux. Même si tous les influenceurs ne sont pas à mettre dans le même sac, la prudence reste nécessaire. Avant de passer commande, vérifiez la renommée du site et la qualité réelle des articles, notamment en consultant les avis sur Internet. Méfiez-vous en particulier des plateformes vantées par les starlettes de la téléréalité. Des solutions comme AntiDrop ou Captain Drop permettent dévaluer le risque quun webmarchand pratique le dropshipping. De nombreux influenceurs profitent de leur notoriété acquise grâce à des émissions de téléréalité ou à des vidéos sur internet pour inciter leurs abonnés à acheter des articles ou souscrire à des services. Or, leurs avis ne sont pas toujours objectifs. Et pour cause, plus leurs abonnés sont nombreux à acheter, plus forte est leur rémunératio les autorités ont reçu 15% de signalements en plus pour des arnaques financières en 2021. Selon le parquet de Paris, le préjudice global est estimé à 500 millions deuros par an concernant les personnes victimes descroqueries financières. Avant de commander, regardez les avis des autres acheteurs. De manière générale, ne croyez pas aux trop belles promesses et aux produits miracles. Dès quun influenceur met en avant un article ou un service, sachez quil est payé pour cela ou quil bénéficie dune contrepartie (des produits gratuits, de la visibilité…). Sincère ou pas, il a intérêt à en dire du bien. Même si l’influenceur vous assure que loffre n’est valable que 24 heures ou que le stock est limité, comparez les sites. Sur AliExpress ou ailleurs, vous pourriez dénicher le même article à son vrai prix, bien plus bas','assets/IMG/ampoule/conseils1.png','2022-01-13',(select c.id FROM categories c where c.name = 'Conseils')),
('Notre lettre de réclamation', 'Lettre de réclamation pour marchandise non conforme','Si larticle reçu ne correspond pas à la commande, il faut faire jouer la garantie légale de conformité. Dune durée de 2 ans minimum pour tout achat en France ou dans lUnion européenne, elle permet de demander gratuitement au vendeur léchange ou la réparation du bien, ou si cela savère impossible, le remboursement des sommes versées. Ce dernier devra prendre en charge les frais de retour de la commande erronée et ceux de la nouvelle livraison.  Il faut savoir également que Que le dommage causé soit dû au transport ou à un dysfonctionnement du matériel, il est important de notifier létat du produit acheté dans un délai de 3 jours suivant la livraison. Selon les conditions dachat, il est possible de demander un avoir, un remboursement ou un remplacement de lobjet en question.','assets/IMG/ampoule/conseils1.png','2022-03-13',(select c.id FROM categories c where c.name = 'Conseils')),
('Sept ans de prison pour un ex-influenceur','Detournement de fonds publics', 'Un ex-influenceur de 24 ans a été condamné mercredi à Paris à sept ans d’emprisonnement et 80.000 euros d’amende, pour avoir mis en place une escroquerie aux aides Covid-19 destinées aux entreprises.','Le jeune homme, dont l’alias en ligne était « PA7 », a été reconnu coupable notamment d’escroquerie et blanchiment en bande organisée, se voyant aussi infliger une interdiction définitive de gérer une entreprise et une inéligibilité de 5 ans', 'assets/IMG/ampoule/conseils1.png','2022-03-13',(select c.id FROM categories c where c.name = 'Actualités')),
('Obtenez réparation facilement','Lettre de réclamation pour non livraison','Comment obtenir réparation ? Une fois votre commande annulée le professionnel doit vous rembourser,au plus tard, dans les quatorze jours suivant la dénonciation du contrat.Si le professionnel ne respecte pas cette échéance fixée par la loi, la somme est automatiquement majorée de 10 % si le remboursement intervient, au plus tard, trente jours après ce terme, de 20 % en cas de remboursement, au plus tard,soixante jours après ce terme, et 50 % ultérieurement','assets/IMG/ampoule/conseils1.png','2022-10-13', (select c.id FROM categories c where c.name = 'Conseils'));


INSERT INTO conferences (file_name, cover)
	VALUES 
	('.....jpg', true),
	('.....jpg', true),
	('.....jpg', true),
	('.....jpg', true),
	('....png', true),
	('.....jpeg', true);

INSERT INTO litigations (label)
	VALUES 
	('origine frauduleuse'),
	('publicit� mensong�re'),
	('fraude bancaire'),
	('non-reception du colis'),
	('Autre');


INSERT INTO progress_status (status)
	VALUES 
	('WAITING'),
	('IN_PROGRESS'),
	('DONE');