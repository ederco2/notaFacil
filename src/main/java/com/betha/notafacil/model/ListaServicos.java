package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ListaServicos extends AbstractEntity {
    @Column(name="codigo")
    private Integer codigo;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "iss_variavel")
    private Double issVariavel;
    @Column(name = "iss_fixo")
    private Double issFixo; // anual
    @Column(name = "item")
    private String item; // 1.01 ou 1.02

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getIssVariavel() {
        return issVariavel;
    }

    public void setIssVariavel(Double issVariavel) {
        this.issVariavel = issVariavel;
    }

    public Double getIssFixo() {
        return issFixo;
    }

    public void setIssFixo(Double issFixo) {
        this.issFixo = issFixo;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}


/*
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(1,1.01,101,'Análise e desenvolvimento de sistemas',1,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(2,1.02,102,'Programação',1,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(3,1.03,103,'Processamento, armazenamento ou hospedagem de dados, textos, imagens, vídeos, páginas eletrônicas, aplicativos e sistemas de informação, entre outros formatos, e congêneres.',1,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(4,1.04,104,'Elaboração de programas de computadores, inclusive de jogos eletrônicos, independentemente  da  arquitetura  construtiva  da  máquina  em  que  o programa será executado, incluindo tablets, smartphones e congêneres.',1,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(5,1.05,105,'Licenciamento ou cessão de direito de uso de programas de computação',1,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(6,1.06,106,'Assessoria e consultoria em informática',1,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(7,1.07,107,'Suporte  técnico  em  informática,  inclusive  instalação,  configuração  e manutenção de programas de computação e bancos de dados',1,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(8,1.08,108,'Planejamento, confecção, manutenção e atualização de páginas eletrônicas',1,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(9,1.09,109,'Disponibilização, sem cessão definitiva, de conteúdos de áudio, vídeo, imagem e texto por meio da internet, respeitada a imunidade de livros, jornais e periódicos',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(10,2.01,201,'Serviços de pesquisas e desenvolvimento de qualquer natureza',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(11,3.01,301,'Locação empresarial de bens móveis (REVOGADO-Lei 9876/05)',0,0);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(12,3.02,302,'Cessão de direito de uso de marcas e de sinais de propaganda',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(13,3.03,303,'Exploração de salões de festas, centro de convenções, escritórios virtuais, stands,  quadras  esportivas,  estádios,  ginásios,  auditórios,  casas  de espetáculos, parques de diversões, canchas e congêneres',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(14,3.04,304,'Locação, sublocação, arrendamento, direito de passagem ou permissão de uso, compartilhado ou não, de ferrovia, rodovia, postes, cabos, dutos e condutos de qualquer natureza',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(15,3.05,305,'Cessão  de  andaimes,  palcos,  coberturas  e  outras  estruturas  de  uso temporário',2,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(16,4.01,401,'Medicina e biomedicina',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(17,4.02,402,'Análises clínicas, patologia, eletricidade médica, radioterapia, quimioterapia, ultrassonografia, ressonância magnética, radiologia, tomografia e congêneres',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(18,4.03,4031,'Laboratórios de análise, incluídos os de patologia clínica',1,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(19,4.03,4032,'Hospitais, clínicas, laboratórios, sanatórios, manicômios, casas de saúde, prontos-socorros, ambulatórios e congêneres',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(20,4.04,404,'Instrumentação cirúrgica',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(21,4.05,405,'Acupuntura',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(22,4.06,406,'Enfermagem, inclusive serviços auxiliares',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(23,4.07,407,'Serviços farmacêuticos',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(24,4.08,408,'Terapia ocupacional, fisioterapia e fonoaudiologia',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(25,4.09,409,'Terapias de qualquer espécie destinadas ao tratamento físico, orgânico e mental',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(26,4.10,410,'Nutrição',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(27,4.11,411,'Obstetrícia',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(28,4.12,412,'Odontologia',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(29,4.13,413,'Ortóptica',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(30,4.14,414,'Próteses sob encomenda',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(31,4.15,415,'Psicanálise',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(32,4.16,416,'Psicologia',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(33,4.17,417,'Casas de repouso e de recuperação, creches, asilos e congêneres',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(34,4.18,418,'Inseminação artificial, fertilização in vitro e congêneres',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(35,4.19,419,'Bancos de sangue, leite, pele, olhos, óvulos, sêmen e congêneres',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(36,4.20,420,'Coleta de sangue, leite, tecidos, sêmen, órgãos e materiais biológicos de qualquer espécie',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(37,4.21,421,'Unidade de atendimento, assistência ou tratamento móvel e congêneres',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(38,4.22,422,'Planos de medicina de grupo ou individual e convênios para prestação de assistência médica, hospitalar, odontológica e congêneres',3,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(39,4.23,423,'Outros planos de saúde que se cumpram através de serviços de terceiros contratados, credenciados, cooperados ou apenas pagos pelo operador do plano mediante indicação do beneficiário',3,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(40,5.01,501,'Medicina veterinária e zootecnia',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(41,5.02,502,'Hospitais, clínicas, ambulatórios, prontos-socorros e congêneres, na área veterinária',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(42,5.03,503,'Laboratórios de análise na área veterinária',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(43,5.04,504,'Inseminação artificial, fertilização in vitro e congêneres',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(44,5.05,505,'Bancos de sangue e de órgãos e congêneres',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(45,5.06,506,'Coleta de sangue, leite, tecidos, sêmen, órgãos e materiais biológicos de qualquer espécie',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(46,5.07,507,'Unidade de atendimento, assistência ou tratamento móvel e congêneres',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(47,5.08,508,'Guarda,  tratamento,  amestramento,  embelezamento,  alojamento  e congêneres',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(48,5.09,509,'Planos de atendimento e assistência médico-veterinária',3,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(49,6.01,6011,'Barbearia, cabeleireiros, manicuros, pedicuros e congêneres',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(50,6.01,6012,'Serviços de Barbearia, cabeleireiros, manicuros, pedicuros e congêneres prestados por profissional parceiro',4,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(51,6.02,6021,'Esteticistas, tratamento de pele, depilação e congêneres',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(52,6.02,6022,'Serviços  de  Esteticistas,  tratamento  de  pele,  depilação  e  congêneres prestados por profissional parceiro',4,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(53,6.03,603,'Banhos, duchas, sauna, massagens e congêneres',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(54,6.04,604,'Ginástica, dança, esportes, natação, artes marciais e demais atividades físicas',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(55,6.05,605,'Centros de emagrecimento, spa e congêneres',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(56,6.06,606,'Aplicação de tatuagens, piercings e congêneres.',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(57,7.01,701,'Engenharia,  agronomia,  agrimensura,  arquitetura,  geologia,  urbanismo, paisagismo e congêneres',1,4);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(58,7.02,702,'Execução, por administração, empreitada ou subempreitada, de obras de construção civil, hidráulica ou elétrica e de outras obras semelhantes, inclusive sondagem, perfuração de poços, escavação, drenagem ',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(59,7.03,703,'Elaboração  de  planos  diretores,  estudos  de  viabilidade,  estudos organizacionais e outros, relacionados com obras e serviços de engenharia, elaboração de anteprojetos, projetos básicos e projetos executivos ',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(60,7.04,704,'Demolição',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(61,7.05,705,'Reparação, conservação e reforma de edifícios, estradas, pontes, portos e congêneres  (exceto  o  fornecimento  de  mercadorias  produzidas  pelo prestador dos serviços, fora do local da prestação dos serviços, que..',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(62,7.06,706,'Colocação  e  instalação  de  tapetes,  carpetes,  assoalhos,  cortinas, revestimentos de parede, vidros, divisórias, placas de gesso e congêneres, com material fornecido pelo tomador do serviço',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(63,7.07,707,'Recuperação, raspagem, polimento e lustração de pisos e congêneres',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(64,7.08,708,'Calafetação',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(65,7.09,709,'Varrição, coleta, remoção, incineração, tratamento, reciclagem, separação e destinação final de lixo, rejeitos e outros resíduos quaisquer',2,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(66,7.10,710,'Limpeza,  manutenção  e  conservação  de  vias  e  logradouros  públicos, imóveis, chaminés, piscinas, parques, jardins e congêneres',2,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(67,7.11,711,'Decoração e jardinagem, inclusive corte e poda de árvores',2,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(68,7.12,712,'Controle e tratamento de efluentes de qualquer natureza e de agentes físicos, químicos e biológicos',2,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(69,7.13,713,'Dedetização,  desinfecção,  desinsetização,  imunização,  higienização, desratização, pulverização e congêneres',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(70,7.14,714,'NIHIL',0,0);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(71,7.15,715,'NIHIL',0,0);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(72,7.16,716,'Florestamento, reflorestamento, semeadura, adubação, reparação de solo, plantio, silagem, colheita, corte e descascamento de árvores, silvicultura, exploração florestal e dos serviços congêneres indissociáveis da formação',2,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(73,7.17,717,'Escoramento, contenção de encostas e serviços congêneres',2,4);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(74,7.18,718,'Limpeza e dragagem de rios, portos, canais, baías, lagos, lagoas, represas, açudes e congêneres',2,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(75,7.19,719,'Acompanhamento e fiscalização da execução de obras de engenharia, arquitetura e urbanismo',2,4);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(76,7.20,720,'Aerofotogrametria  (inclusive  interpretação),  cartografia,  mapeamento, levantamentos topográficos, batimétricos, geográficos, geodésicos, geológicos, geofísicos e congêneres',1,4);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(77,7.21,721,'Pesquisa,  perfuração,  cimentação,  mergulho,  perfilagem,  concretação, testemunhagem, pescaria, estimulação e outros serviços relacionados com a exploração e explotação de petróleo, gás natural e de outros recursos minerais',1,4);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(78,7.22,722,'Nucleação e bombardeamento de nuvens e congêneres',1,4);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(79,8.01,801,'Ensino regular pré-escolar, fundamental e médio, superior, inclusive pós- graduação (Redação Lei 10.417/2007)',1,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(80,8.02,802,'Instrução, treinamento, orientação pedagógica e educacional, avaliação de conhecimentos de qualquer natureza',1,4);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(81,9.01,9011,'Hospedagem de qualquer natureza em hotéis, apart-service condominiais, flat, apart-hotéis, hotéis residência, residence-service, suíte service, hotelaria marítima, motéis, pensões e congêneres, ocupação por temporada com fornecimento',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(82,9.01,9012,'Motéis e congêneres',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(83,9.02,902,'Agenciamento,  organização,  promoção,  intermediação  e  execução  de programas  de  turismo,  passeios,  viagens,  excursões,  hospedagens  e congêneres',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(84,9.03,903,'Guias de turismo',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(85,10.01,1001,'Agenciamento, corretagem ou intermediação de câmbio, de seguros, de cartões de crédito, de planos de saúde e de planos de previdência privada',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(86,10.02,1002,'Agenciamento, corretagem ou intermediação de títulos em geral, valores mobiliários e contratos quaisquer',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(87,10.03,1003,'Agenciamento, corretagem ou intermediação de direitos de propriedade industrial, artística ou literária',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(88,10.04,1004,'Agenciamento, corretagem ou intermediação de contratos de arrendamento mercantil (leasing), de franquia (franchising) e de faturização (factoring)',3,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(89,10.05,1005,'Agenciamento, corretagem ou intermediação de bens móveis ou imóveis, não abrangidos em outros itens ou subitens, inclusive aqueles realizados no âmbito de Bolsas de Mercadorias e Futuros, por quaisquer meios',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(90,10.06,1006,'Agenciamento marítimo',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(91,10.07,1007,'Agenciamento de notícias',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(92,10.08,1008,'Agenciamento de publicidade e propaganda, inclusive o agenciamento de veiculação por quaisquer meios',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(93,10.09,1009,'Representação de qualquer natureza, inclusive comercial',1,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(94,10.10,1010,'Distribuição de bens de terceiros',1,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(95,11.01,1101,'Guarda e estacionamento de veículos terrestres automotores, de aeronaves e de embarcações',3,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(96,11.02,1102,'Vigilância, segurança ou monitoramento de bens, pessoas e semoventes',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(97,11.03,1103,'Escolta, inclusive de veículos e cargas',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(98,11.04,1104,'Armazenamento, depósito, carga, descarga, arrumação e guarda de bens de qualquer espécie',2,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(99,12.01,1201,'Espetáculos teatrais',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(100,12.02,1202,'Exibições cinematográficas',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(101,12.03,1203,'Espetáculos circenses',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(102,12.04,1204,'Programas de auditório',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(103,12.05,1205,'Parques de diversões, centros de lazer e congêneres',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(104,12.06,1206,'Boates, taxi-dancing e congêneres',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(105,12.07,1207,'Shows, ballet, danças, desfiles, bailes, óperas, concertos, recitais, festivais e congêneres',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(106,12.08,12081,'Feiras, exposições, congressos e congêneres',2,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(107,12.08,12082,'Congressos e eventos de natureza exclusivamente técnica ou científica',2,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(108,12.08,12083,'Exposições Agropecuárias incluídas no Calendário Brasileiro de Exposições e Feiras, de abrangência internacional, realizadas em Londrina',2,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(109,12.09,1209,'Bilhares, boliches e diversões eletrônicas ou não',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(110,12.10,1210,'Corridas e competições de animais',2,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(111,12.11,1211,'Competições esportivas ou de destreza física ou intelectual, com ou sem a participação do espectador',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(112,12.12,1212,'Execução de música',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(113,12.13,1213,'Produção, mediante ou sem encomenda prévia, de eventos, espetáculos, entrevistas,  shows,  ballet,  danças,  desfiles,  bailes,  teatros,  óperas, concertos, recitais, festivais e congêneres',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(114,12.14,1214,'Fornecimento  de  música  para  ambientes  fechados  ou  não,  mediante transmissão por qualquer processo',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(115,12.15,1215,'Desfiles de blocos carnavalescos ou folclóricos, trios elétricos e congêneres',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(116,12.16,1216,'Exibição de filmes, entrevistas, musicais, espetáculos, shows, concertos, desfiles,  óperas,  competições  esportivas,  de  destreza  intelectual  ou congêneres',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(117,12.17,1217,'Recreação e animação, inclusive em festas e eventos de qualquer natureza',2,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(118,12.18,1218,'Serviços   de   televisão   por   assinatura   prestados   na   área   do   Município (REVOGADO-Lei  9876/05)',0,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(119,13.01,1301,'NIHIL',0,0);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(120,13.02,1302,'Fonografia ou gravação de sons, inclusive trucagem, dublagem, mixagem e congêneres',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(121,13.03,1303,'Fotografia  e  cinematografia,  inclusive  revelação,  ampliação,  cópia, reprodução, trucagem e congêneres',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(122,13.04,1304,'Reprografia, microfilmagem e digitalização',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(123,13.05,1305,'Composição gráfica, inclusive confecção de impressos gráficos, fotocomposição, clicheria, zincografia, litografia e fotolitografia, exceto se destinados a posterior operação de comercialização ou industrialização, ainda',1,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(124,14.01,1401,'Lubrificação,  limpeza,  lustração,  revisão,  carga  e  recarga,  conserto, restauração, blindagem, manutenção e conservação de máquinas, veículos, aparelhos, equipamentos, motores, elevadores ou de qualquer objeto (exceto',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(125,14.02,1402,'Assistência técnica',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(126,14.03,1403,'Recondicionamento de motores (exceto peças e partes empregadas, que ficam sujeitas ao ICMS)',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(127,14.04,1404,'Recauchutagem ou regeneração de pneus',1,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(128,14.05,1405,'Restauração,   recondicionamento,   acondicionamento,   pintura, beneficiamento, lavagem, secagem, tingimento, galvanoplastia, anodização, corte, recorte, plastificação, costura, acabamento, polimento e congêneres de objetos quaisquer',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(129,14.06,1406,'Instalação e montagem de aparelhos, máquinas e equipamentos, inclusive montagem  industrial,  prestados  ao  usuário  final,  exclusivamente  com material por ele fornecido',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(130,14.07,1407,'Colocação de molduras e congêneres',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(131,14.08,1408,'Encadernação, gravação e douração de livros, revistas e congêneres',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(132,14.09,1409,'Alfaiataria e costura, quando o material for fornecido pelo usuário final, exceto aviamento',1,3);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(133,14.10,1410,'Tinturaria e lavanderia',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(134,14.11,1411,'Tapeçaria e reforma de estofamentos em geral',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(135,14.12,1412,'Funilaria e lanternagem',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(136,14.13,1413,'Carpintaria e serralheria',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(137,14.14,1414,'Guincho intramunicipal, guindaste e içamento',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(138,15.01,15011,'Administração de fundos quaisquer, de consórcio, de cartão de crédito ou débito e congêneres, de carteira de clientes, de cheques pré-datados e congêneres (Redação Lei 9876/05)',3,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(139,15.01,15012,'Administração de Consórcios para Aquisição de Bens e Direitos, autorizados pela União ou quem de direito (AC. Lei 11.442-19-12-2011)',3,2);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(140,15.02,1502,'Abertura  de  contas  em  geral,  inclusive  conta  corrente,  conta  de investimentos e aplicação e caderneta de poupança, no País e no exterior, bem como a manutenção das referidas contas ativas e inativas',1,5);
insert into notafacil.lista_servicos (id,item,codigo,descricao,iss_fixo,iss_variavel) values(141,15.03,1503,'Locação e manutenção de cofres particulares, de terminais eletrônicos, de terminais de atendimento e de bens e equipamentos em geral',1,5);

*/
