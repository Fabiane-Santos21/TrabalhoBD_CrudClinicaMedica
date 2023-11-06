CREATE DATABASE clinicaMedica
GO
USE clinicaMedica
GO
CREATE TABLE medico (
IdMedico	         INT           NOT NULL  IDENTITY,
crm		             INT           NOT NULL,
nome                 VARCHAR(60)   NOT NULL,
logradouro	         VARCHAR(200)  NOT NULL,
numero		         INT           NOT NULL   CHECK(numero > 0),
cep		             CHAR(8)       NOT NULL   CHECK(LEN(CEP) = 8),
bairro		         VARCHAR(100)  NOT NULL,
telefoneResidencial	 CHAR(10)     NOT NULL,
telefoneCelular		 CHAR(11)     NOT NULL,
especialidade	     VARCHAR(30)   NOT NULL
PRIMARY KEY(IdMedico)
)

GO
CREATE TABLE paciente (
id			          INT           NOT NULL   IDENTITY,
nome		          VARCHAR(60)   NOT NULL,
cpf			          CHAR(11)      NOT NULL,
logradouro		      VARCHAR(200)  NOT NULL,
numero			      INT           NOT NULL   CHECK(numero > 0),
cep			          CHAR(8)       NOT NULL   CHECK(LEN(CEP) = 8),	
bairro		          VARCHAR(100)  NOT NULL,
telefoneResidencial	  CHAR(10)      NOT NULL,
telefoneCelular		  CHAR(11)      NOT NULL,
email	              VARCHAR(45)   NOT NULL,
sexo		          CHAR(1)       NOT NULL,
PacIdMedico		      INT 	        NOT NULL
PRIMARY KEY(id),
FOREIGN KEY(PacIdMedico) REFERENCES medico(IdMedico)
)
GO 
CREATE TABLE fatura (
FatId			    INT		       NOT NULL,
FatNome			    VARCHAR(100)   NOT NULL,
FatDescricao	    VARCHAR(200)   NOT NULL,
FatValor		    DECIMAL(7,2)   NOT NULL    CHECK(FatValor > 0.00),
FatIdPaciente	    INT   		   NOT NULL
PRIMARY KEY (FatId)
FOREIGN KEY(FatIdPaciente) REFERENCES paciente(id)
)

GO
CREATE TABLE consulta(
ConsId			         INT		   NOT NULL,
ConsNome		         VARCHAR(100)  NOT NULL,
consData		         DATETIME      NOT NULL,
IdPaciente               INT		   NOT NULL,
ConsIdMedico	         INT		   NOT NULL,
ConsIdExame		         INT		   NOT NULL,
ConsIdPaciente	         INT		   NOT NULL
PRIMARY KEY(ConsId) 
FOREIGN KEY(ConsIdPaciente) REFERENCES paciente(id),
FOREIGN KEY(ConsIdMedico) REFERENCES medico(IdMedico),
FOREIGN KEY(ConsIdExame) REFERENCES exame(Exaid)
)

GO 
CREATE TABLE exame(
ExaId			     INT 	        NOT NULL,
ExaNome			     VARCHAR(150)	NOT NULL,
ExaDescricao	     VARCHAR(255)	NOT NULL,
ExaIdPaciente	     INT			NOT NULL
PRIMARY KEY(ExaId),
FOREIGN KEY(ExaIdPaciente) REFERENCES paciente(id)
)


