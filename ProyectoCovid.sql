PGDMP     !                    {            Proyecto_Final_Local3    14.4    14.4 �    <           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            =           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            >           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    24573    Proyecto_Final_Local3    DATABASE     {   CREATE DATABASE "Proyecto_Final_Local3" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';
 '   DROP DATABASE "Proyecto_Final_Local3";
                postgres    false            m           1247    24786    email_domain    DOMAIN     �   CREATE DOMAIN public.email_domain AS character varying NOT NULL
	CONSTRAINT email_domain_check CHECK (((VALUE)::text ~* '^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+[.][A-Za-z]+$'::text));
 !   DROP DOMAIN public.email_domain;
       public          postgres    false            q           1247    24789    identificador    DOMAIN     z   CREATE DOMAIN public.identificador AS numeric(4,0) DEFAULT 0
	CONSTRAINT identificador_check CHECK ((VALUE IS NOT NULL));
 "   DROP DOMAIN public.identificador;
       public          postgres    false            �           1247    27382    tipo_estado    TYPE     M   CREATE TYPE public.tipo_estado AS ENUM (
    'En curso',
    'Finalizado'
);
    DROP TYPE public.tipo_estado;
       public          postgres    false            u           1247    24792    tipo_genero    TYPE     H   CREATE TYPE public.tipo_genero AS ENUM (
    'F',
    'M',
    'N/A'
);
    DROP TYPE public.tipo_genero;
       public          postgres    false            x           1247    24800    tipo_vacuna    TYPE     x   CREATE TYPE public.tipo_vacuna AS ENUM (
    'ARN Mensajero o ARNm',
    'Vector viral',
    'Subunidades proteicas'
);
    DROP TYPE public.tipo_vacuna;
       public          postgres    false            {           1247    24808    tipo_variante    TYPE     N   CREATE TYPE public.tipo_variante AS ENUM (
    'VOC',
    'VOI',
    'VUM'
);
     DROP TYPE public.tipo_variante;
       public          postgres    false                       1259    25186    asignado    TABLE     �   CREATE TABLE public.asignado (
    docidentidad_ps text NOT NULL,
    codcentro integer NOT NULL,
    fechaasignado date NOT NULL
);
    DROP TABLE public.asignado;
       public         heap    postgres    false                       1259    25185    asignado_codcentro_seq    SEQUENCE     �   CREATE SEQUENCE public.asignado_codcentro_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.asignado_codcentro_seq;
       public          postgres    false    260            @           0    0    asignado_codcentro_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.asignado_codcentro_seq OWNED BY public.asignado.codcentro;
          public          postgres    false    259            �            1259    24937    centro_salud    TABLE     �   CREATE TABLE public.centro_salud (
    codcentro integer NOT NULL,
    nombcentro text NOT NULL,
    direccion text NOT NULL,
    docidentidad_encargado text NOT NULL,
    fechaencargado date NOT NULL,
    codestado integer NOT NULL
);
     DROP TABLE public.centro_salud;
       public         heap    postgres    false            �            1259    24935    centro_salud_codcentro_seq    SEQUENCE     �   CREATE SEQUENCE public.centro_salud_codcentro_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.centro_salud_codcentro_seq;
       public          postgres    false    229            A           0    0    centro_salud_codcentro_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.centro_salud_codcentro_seq OWNED BY public.centro_salud.codcentro;
          public          postgres    false    227            �            1259    24936    centro_salud_codestado_seq    SEQUENCE     �   CREATE SEQUENCE public.centro_salud_codestado_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.centro_salud_codestado_seq;
       public          postgres    false    229            B           0    0    centro_salud_codestado_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.centro_salud_codestado_seq OWNED BY public.centro_salud.codestado;
          public          postgres    false    228            �            1259    25095    consiste    TABLE     W  CREATE TABLE public.consiste (
    codtrat integer NOT NULL,
    codmedicamento integer NOT NULL,
    dosis integer NOT NULL,
    cantdias integer NOT NULL,
    frecuencia integer NOT NULL,
    CONSTRAINT ck_cantdias CHECK ((cantdias > 0)),
    CONSTRAINT ck_dosis CHECK ((dosis > 0)),
    CONSTRAINT ck_frecuencia CHECK ((frecuencia > 0))
);
    DROP TABLE public.consiste;
       public         heap    postgres    false            �            1259    25094    consiste_codmedicamento_seq    SEQUENCE     �   CREATE SEQUENCE public.consiste_codmedicamento_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.consiste_codmedicamento_seq;
       public          postgres    false    251            C           0    0    consiste_codmedicamento_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.consiste_codmedicamento_seq OWNED BY public.consiste.codmedicamento;
          public          postgres    false    250            �            1259    25093    consiste_codtrat_seq    SEQUENCE     �   CREATE SEQUENCE public.consiste_codtrat_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.consiste_codtrat_seq;
       public          postgres    false    251            D           0    0    consiste_codtrat_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.consiste_codtrat_seq OWNED BY public.consiste.codtrat;
          public          postgres    false    249            �            1259    25076    contagio    TABLE     �   CREATE TABLE public.contagio (
    denom_oms text NOT NULL,
    docidentidad text NOT NULL,
    fechacontagio date NOT NULL,
    tiemporeposo integer NOT NULL,
    casahospitalizado boolean NOT NULL
);
    DROP TABLE public.contagio;
       public         heap    postgres    false            �            1259    25057    eficaz    TABLE     �   CREATE TABLE public.eficaz (
    idvacuna integer NOT NULL,
    denom_oms text NOT NULL,
    porceficacia real NOT NULL,
    CONSTRAINT ck_porceficacia CHECK ((porceficacia > (0)::double precision))
);
    DROP TABLE public.eficaz;
       public         heap    postgres    false            �            1259    25056    eficaz_idvacuna_seq    SEQUENCE     �   CREATE SEQUENCE public.eficaz_idvacuna_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.eficaz_idvacuna_seq;
       public          postgres    false    247            E           0    0    eficaz_idvacuna_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.eficaz_idvacuna_seq OWNED BY public.eficaz.idvacuna;
          public          postgres    false    246            �            1259    24961 
   enfermedad    TABLE     i   CREATE TABLE public.enfermedad (
    codenfermedad integer NOT NULL,
    nombenfermedad text NOT NULL
);
    DROP TABLE public.enfermedad;
       public         heap    postgres    false            �            1259    24960    enfermedad_codenfermedad_seq    SEQUENCE     �   CREATE SEQUENCE public.enfermedad_codenfermedad_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public.enfermedad_codenfermedad_seq;
       public          postgres    false    231            F           0    0    enfermedad_codenfermedad_seq    SEQUENCE OWNED BY     ]   ALTER SEQUENCE public.enfermedad_codenfermedad_seq OWNED BY public.enfermedad.codenfermedad;
          public          postgres    false    230            �            1259    24834    estado_provincia    TABLE     �   CREATE TABLE public.estado_provincia (
    codestado integer NOT NULL,
    nombestado text NOT NULL,
    codpais integer NOT NULL
);
 $   DROP TABLE public.estado_provincia;
       public         heap    postgres    false            �            1259    24832    estado_provincia_codestado_seq    SEQUENCE     �   CREATE SEQUENCE public.estado_provincia_codestado_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 5   DROP SEQUENCE public.estado_provincia_codestado_seq;
       public          postgres    false    214            G           0    0    estado_provincia_codestado_seq    SEQUENCE OWNED BY     a   ALTER SEQUENCE public.estado_provincia_codestado_seq OWNED BY public.estado_provincia.codestado;
          public          postgres    false    212            �            1259    24833    estado_provincia_codpais_seq    SEQUENCE     �   CREATE SEQUENCE public.estado_provincia_codpais_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public.estado_provincia_codpais_seq;
       public          postgres    false    214            H           0    0    estado_provincia_codpais_seq    SEQUENCE OWNED BY     ]   ALTER SEQUENCE public.estado_provincia_codpais_seq OWNED BY public.estado_provincia.codpais;
          public          postgres    false    213            �            1259    25007    hospitalizacion    TABLE     L   CREATE TABLE public.hospitalizacion (
    codcentro_hos integer NOT NULL
);
 #   DROP TABLE public.hospitalizacion;
       public         heap    postgres    false            �            1259    25006 !   hospitalizacion_codcentro_hos_seq    SEQUENCE     �   CREATE SEQUENCE public.hospitalizacion_codcentro_hos_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 8   DROP SEQUENCE public.hospitalizacion_codcentro_hos_seq;
       public          postgres    false    240            I           0    0 !   hospitalizacion_codcentro_hos_seq    SEQUENCE OWNED BY     g   ALTER SEQUENCE public.hospitalizacion_codcentro_hos_seq OWNED BY public.hospitalizacion.codcentro_hos;
          public          postgres    false    239            �            1259    25135    hospitalizado    TABLE     �   CREATE TABLE public.hospitalizado (
    docidentidad_pac text NOT NULL,
    codcentro_hos integer NOT NULL,
    fechahospitalizado date NOT NULL
);
 !   DROP TABLE public.hospitalizado;
       public         heap    postgres    false            �            1259    25134    hospitalizado_codcentro_hos_seq    SEQUENCE     �   CREATE SEQUENCE public.hospitalizado_codcentro_hos_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 6   DROP SEQUENCE public.hospitalizado_codcentro_hos_seq;
       public          postgres    false    255            J           0    0    hospitalizado_codcentro_hos_seq    SEQUENCE OWNED BY     c   ALTER SEQUENCE public.hospitalizado_codcentro_hos_seq OWNED BY public.hospitalizado.codcentro_hos;
          public          postgres    false    254            �            1259    24908    medicamento    TABLE     �   CREATE TABLE public.medicamento (
    codmedicamento integer NOT NULL,
    nombremedicamento text NOT NULL,
    compuesto text NOT NULL,
    concentracion real NOT NULL,
    CONSTRAINT ck_concentracion CHECK ((concentracion > (0)::double precision))
);
    DROP TABLE public.medicamento;
       public         heap    postgres    false            �            1259    24907    medicamento_codmedicamento_seq    SEQUENCE     �   CREATE SEQUENCE public.medicamento_codmedicamento_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 5   DROP SEQUENCE public.medicamento_codmedicamento_seq;
       public          postgres    false    223            K           0    0    medicamento_codmedicamento_seq    SEQUENCE OWNED BY     a   ALTER SEQUENCE public.medicamento_codmedicamento_seq OWNED BY public.medicamento.codmedicamento;
          public          postgres    false    222            �            1259    24860    medico    TABLE     C   CREATE TABLE public.medico (
    docidentidad_med text NOT NULL
);
    DROP TABLE public.medico;
       public         heap    postgres    false            �            1259    24980 	   municipio    TABLE     �   CREATE TABLE public.municipio (
    codmunicipio integer NOT NULL,
    nombmunicipio text NOT NULL,
    codestado integer NOT NULL
);
    DROP TABLE public.municipio;
       public         heap    postgres    false            �            1259    24979    municipio_codestado_seq    SEQUENCE     �   CREATE SEQUENCE public.municipio_codestado_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.municipio_codestado_seq;
       public          postgres    false    236            L           0    0    municipio_codestado_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.municipio_codestado_seq OWNED BY public.municipio.codestado;
          public          postgres    false    235            �            1259    24978    municipio_codmunicipio_seq    SEQUENCE     �   CREATE SEQUENCE public.municipio_codmunicipio_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.municipio_codmunicipio_seq;
       public          postgres    false    236            M           0    0    municipio_codmunicipio_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.municipio_codmunicipio_seq OWNED BY public.municipio.codmunicipio;
          public          postgres    false    234            �            1259    24872    paciente    TABLE     E   CREATE TABLE public.paciente (
    docidentidad_pac text NOT NULL
);
    DROP TABLE public.paciente;
       public         heap    postgres    false                       1259    25205    padece    TABLE     c   CREATE TABLE public.padece (
    docidentidad text NOT NULL,
    codenfermedad integer NOT NULL
);
    DROP TABLE public.padece;
       public         heap    postgres    false                       1259    25204    padece_codenfermedad_seq    SEQUENCE     �   CREATE SEQUENCE public.padece_codenfermedad_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.padece_codenfermedad_seq;
       public          postgres    false    262            N           0    0    padece_codenfermedad_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.padece_codenfermedad_seq OWNED BY public.padece.codenfermedad;
          public          postgres    false    261            �            1259    24824    pais    TABLE     X   CREATE TABLE public.pais (
    cod_pais integer NOT NULL,
    nombpais text NOT NULL
);
    DROP TABLE public.pais;
       public         heap    postgres    false            �            1259    24823    pais_cod_pais_seq    SEQUENCE     �   CREATE SEQUENCE public.pais_cod_pais_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.pais_cod_pais_seq;
       public          postgres    false    211            O           0    0    pais_cod_pais_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.pais_cod_pais_seq OWNED BY public.pais.cod_pais;
          public          postgres    false    210            �            1259    24815    persona    TABLE     s  CREATE TABLE public.persona (
    doc_identidad text NOT NULL,
    nombper text NOT NULL,
    apellidoper text NOT NULL,
    fecha_nac date NOT NULL,
    sexo public.tipo_genero NOT NULL,
    direccion_p text NOT NULL,
    n_contacto bigint NOT NULL,
    alto_riesgo boolean NOT NULL,
    ocupacion text NOT NULL,
    CONSTRAINT ck_n_contacto CHECK ((n_contacto > 0))
);
    DROP TABLE public.persona;
       public         heap    postgres    false    885            �            1259    24848    personal_salud    TABLE     �   CREATE TABLE public.personal_salud (
    docidentidad_ps text NOT NULL,
    correo public.email_domain NOT NULL,
    es_asis_medico boolean NOT NULL,
    es_enfermero boolean NOT NULL
);
 "   DROP TABLE public.personal_salud;
       public         heap    postgres    false    877            �            1259    25039    presenta    TABLE     a   CREATE TABLE public.presenta (
    idvacuna integer NOT NULL,
    codsintoma integer NOT NULL
);
    DROP TABLE public.presenta;
       public         heap    postgres    false            �            1259    25038    presenta_codsintoma_seq    SEQUENCE     �   CREATE SEQUENCE public.presenta_codsintoma_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.presenta_codsintoma_seq;
       public          postgres    false    245            P           0    0    presenta_codsintoma_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.presenta_codsintoma_seq OWNED BY public.presenta.codsintoma;
          public          postgres    false    244            �            1259    25037    presenta_idvacuna_seq    SEQUENCE     �   CREATE SEQUENCE public.presenta_idvacuna_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.presenta_idvacuna_seq;
       public          postgres    false    245            Q           0    0    presenta_idvacuna_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.presenta_idvacuna_seq OWNED BY public.presenta.idvacuna;
          public          postgres    false    243            �            1259    25116    requiere    TABLE     �   CREATE TABLE public.requiere (
    docidentidad_pac text NOT NULL,
    codtrat integer NOT NULL,
    fecha date NOT NULL,
    estado_tratamiento public.tipo_estado NOT NULL
);
    DROP TABLE public.requiere;
       public         heap    postgres    false    972            �            1259    25115    requiere_codtrat_seq    SEQUENCE     �   CREATE SEQUENCE public.requiere_codtrat_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.requiere_codtrat_seq;
       public          postgres    false    253            R           0    0    requiere_codtrat_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.requiere_codtrat_seq OWNED BY public.requiere.codtrat;
          public          postgres    false    252                       1259    25224    reside    TABLE     ~   CREATE TABLE public.reside (
    docidentidad text NOT NULL,
    codestado integer NOT NULL,
    fechareside date NOT NULL
);
    DROP TABLE public.reside;
       public         heap    postgres    false                       1259    25223    reside_codestado_seq    SEQUENCE     �   CREATE SEQUENCE public.reside_codestado_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.reside_codestado_seq;
       public          postgres    false    264            S           0    0    reside_codestado_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.reside_codestado_seq OWNED BY public.reside.codestado;
          public          postgres    false    263            �            1259    24899    sintoma_efecto    TABLE     j   CREATE TABLE public.sintoma_efecto (
    codsintoma integer NOT NULL,
    descripsintoma text NOT NULL
);
 "   DROP TABLE public.sintoma_efecto;
       public         heap    postgres    false            �            1259    24898    sintoma_efecto_codsintoma_seq    SEQUENCE     �   CREATE SEQUENCE public.sintoma_efecto_codsintoma_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 4   DROP SEQUENCE public.sintoma_efecto_codsintoma_seq;
       public          postgres    false    221            T           0    0    sintoma_efecto_codsintoma_seq    SEQUENCE OWNED BY     _   ALTER SEQUENCE public.sintoma_efecto_codsintoma_seq OWNED BY public.sintoma_efecto.codsintoma;
          public          postgres    false    220            �            1259    25019    tiene    TABLE     \   CREATE TABLE public.tiene (
    denom_oms text NOT NULL,
    codsintoma integer NOT NULL
);
    DROP TABLE public.tiene;
       public         heap    postgres    false            �            1259    25018    tiene_codsintoma_seq    SEQUENCE     �   CREATE SEQUENCE public.tiene_codsintoma_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.tiene_codsintoma_seq;
       public          postgres    false    242            U           0    0    tiene_codsintoma_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.tiene_codsintoma_seq OWNED BY public.tiene.codsintoma;
          public          postgres    false    241            �            1259    24970    tratamiento    TABLE     h   CREATE TABLE public.tratamiento (
    codtrat integer NOT NULL,
    descriptratamiento text NOT NULL
);
    DROP TABLE public.tratamiento;
       public         heap    postgres    false            �            1259    24969    tratamiento_codtrat_seq    SEQUENCE     �   CREATE SEQUENCE public.tratamiento_codtrat_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.tratamiento_codtrat_seq;
       public          postgres    false    233            V           0    0    tratamiento_codtrat_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.tratamiento_codtrat_seq OWNED BY public.tratamiento.codtrat;
          public          postgres    false    232            �            1259    24919    vacuna    TABLE     Z  CREATE TABLE public.vacuna (
    idvacuna integer NOT NULL,
    lote integer NOT NULL,
    nombvacuna text NOT NULL,
    cantdosis integer NOT NULL,
    laboratorio text NOT NULL,
    tipo public.tipo_vacuna NOT NULL,
    codpais integer NOT NULL,
    CONSTRAINT ck_cantdosis CHECK ((cantdosis > 0)),
    CONSTRAINT ck_lote CHECK ((lote > 0))
);
    DROP TABLE public.vacuna;
       public         heap    postgres    false    888            �            1259    24918    vacuna_codpais_seq    SEQUENCE     �   CREATE SEQUENCE public.vacuna_codpais_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.vacuna_codpais_seq;
       public          postgres    false    226            W           0    0    vacuna_codpais_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.vacuna_codpais_seq OWNED BY public.vacuna.codpais;
          public          postgres    false    225            �            1259    24917    vacuna_idvacuna_seq    SEQUENCE     �   CREATE SEQUENCE public.vacuna_idvacuna_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.vacuna_idvacuna_seq;
       public          postgres    false    226            X           0    0    vacuna_idvacuna_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.vacuna_idvacuna_seq OWNED BY public.vacuna.idvacuna;
          public          postgres    false    224            �            1259    24995 
   vacunacion    TABLE     G   CREATE TABLE public.vacunacion (
    codcentro_vac integer NOT NULL
);
    DROP TABLE public.vacunacion;
       public         heap    postgres    false            �            1259    24994    vacunacion_codcentro_vac_seq    SEQUENCE     �   CREATE SEQUENCE public.vacunacion_codcentro_vac_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public.vacunacion_codcentro_vac_seq;
       public          postgres    false    238            Y           0    0    vacunacion_codcentro_vac_seq    SEQUENCE OWNED BY     ]   ALTER SEQUENCE public.vacunacion_codcentro_vac_seq OWNED BY public.vacunacion.codcentro_vac;
          public          postgres    false    237                       1259    25155    vacunada    TABLE       CREATE TABLE public.vacunada (
    docidentidad text NOT NULL,
    idvacuna integer NOT NULL,
    codcentro_vac integer NOT NULL,
    docidentidad_ps text NOT NULL,
    fechavacuna date NOT NULL,
    dosis integer NOT NULL,
    CONSTRAINT ck_dosis CHECK ((dosis > 0))
);
    DROP TABLE public.vacunada;
       public         heap    postgres    false                       1259    25154    vacunada_codcentro_vac_seq    SEQUENCE     �   CREATE SEQUENCE public.vacunada_codcentro_vac_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.vacunada_codcentro_vac_seq;
       public          postgres    false    258            Z           0    0    vacunada_codcentro_vac_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.vacunada_codcentro_vac_seq OWNED BY public.vacunada.codcentro_vac;
          public          postgres    false    257                        1259    25153    vacunada_idvacuna_seq    SEQUENCE     �   CREATE SEQUENCE public.vacunada_idvacuna_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.vacunada_idvacuna_seq;
       public          postgres    false    258            [           0    0    vacunada_idvacuna_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.vacunada_idvacuna_seq OWNED BY public.vacunada.idvacuna;
          public          postgres    false    256            �            1259    24885    virus_variante    TABLE     �   CREATE TABLE public.virus_variante (
    denom_oms text NOT NULL,
    linaje text NOT NULL,
    fechaorigen date NOT NULL,
    clasificacion public.tipo_variante NOT NULL,
    codpais integer NOT NULL
);
 "   DROP TABLE public.virus_variante;
       public         heap    postgres    false    891            �            1259    24884    virus_variante_codpais_seq    SEQUENCE     �   CREATE SEQUENCE public.virus_variante_codpais_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.virus_variante_codpais_seq;
       public          postgres    false    219            \           0    0    virus_variante_codpais_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.virus_variante_codpais_seq OWNED BY public.virus_variante.codpais;
          public          postgres    false    218                       2604    25189    asignado codcentro    DEFAULT     x   ALTER TABLE ONLY public.asignado ALTER COLUMN codcentro SET DEFAULT nextval('public.asignado_codcentro_seq'::regclass);
 A   ALTER TABLE public.asignado ALTER COLUMN codcentro DROP DEFAULT;
       public          postgres    false    260    259    260                        2604    24940    centro_salud codcentro    DEFAULT     �   ALTER TABLE ONLY public.centro_salud ALTER COLUMN codcentro SET DEFAULT nextval('public.centro_salud_codcentro_seq'::regclass);
 E   ALTER TABLE public.centro_salud ALTER COLUMN codcentro DROP DEFAULT;
       public          postgres    false    227    229    229                       2604    24941    centro_salud codestado    DEFAULT     �   ALTER TABLE ONLY public.centro_salud ALTER COLUMN codestado SET DEFAULT nextval('public.centro_salud_codestado_seq'::regclass);
 E   ALTER TABLE public.centro_salud ALTER COLUMN codestado DROP DEFAULT;
       public          postgres    false    229    228    229                       2604    25098    consiste codtrat    DEFAULT     t   ALTER TABLE ONLY public.consiste ALTER COLUMN codtrat SET DEFAULT nextval('public.consiste_codtrat_seq'::regclass);
 ?   ALTER TABLE public.consiste ALTER COLUMN codtrat DROP DEFAULT;
       public          postgres    false    251    249    251                       2604    25099    consiste codmedicamento    DEFAULT     �   ALTER TABLE ONLY public.consiste ALTER COLUMN codmedicamento SET DEFAULT nextval('public.consiste_codmedicamento_seq'::regclass);
 F   ALTER TABLE public.consiste ALTER COLUMN codmedicamento DROP DEFAULT;
       public          postgres    false    250    251    251                       2604    25060    eficaz idvacuna    DEFAULT     r   ALTER TABLE ONLY public.eficaz ALTER COLUMN idvacuna SET DEFAULT nextval('public.eficaz_idvacuna_seq'::regclass);
 >   ALTER TABLE public.eficaz ALTER COLUMN idvacuna DROP DEFAULT;
       public          postgres    false    246    247    247                       2604    24964    enfermedad codenfermedad    DEFAULT     �   ALTER TABLE ONLY public.enfermedad ALTER COLUMN codenfermedad SET DEFAULT nextval('public.enfermedad_codenfermedad_seq'::regclass);
 G   ALTER TABLE public.enfermedad ALTER COLUMN codenfermedad DROP DEFAULT;
       public          postgres    false    230    231    231            �           2604    24837    estado_provincia codestado    DEFAULT     �   ALTER TABLE ONLY public.estado_provincia ALTER COLUMN codestado SET DEFAULT nextval('public.estado_provincia_codestado_seq'::regclass);
 I   ALTER TABLE public.estado_provincia ALTER COLUMN codestado DROP DEFAULT;
       public          postgres    false    214    212    214            �           2604    24838    estado_provincia codpais    DEFAULT     �   ALTER TABLE ONLY public.estado_provincia ALTER COLUMN codpais SET DEFAULT nextval('public.estado_provincia_codpais_seq'::regclass);
 G   ALTER TABLE public.estado_provincia ALTER COLUMN codpais DROP DEFAULT;
       public          postgres    false    214    213    214                       2604    25010    hospitalizacion codcentro_hos    DEFAULT     �   ALTER TABLE ONLY public.hospitalizacion ALTER COLUMN codcentro_hos SET DEFAULT nextval('public.hospitalizacion_codcentro_hos_seq'::regclass);
 L   ALTER TABLE public.hospitalizacion ALTER COLUMN codcentro_hos DROP DEFAULT;
       public          postgres    false    240    239    240                       2604    25138    hospitalizado codcentro_hos    DEFAULT     �   ALTER TABLE ONLY public.hospitalizado ALTER COLUMN codcentro_hos SET DEFAULT nextval('public.hospitalizado_codcentro_hos_seq'::regclass);
 J   ALTER TABLE public.hospitalizado ALTER COLUMN codcentro_hos DROP DEFAULT;
       public          postgres    false    254    255    255            �           2604    24911    medicamento codmedicamento    DEFAULT     �   ALTER TABLE ONLY public.medicamento ALTER COLUMN codmedicamento SET DEFAULT nextval('public.medicamento_codmedicamento_seq'::regclass);
 I   ALTER TABLE public.medicamento ALTER COLUMN codmedicamento DROP DEFAULT;
       public          postgres    false    222    223    223                       2604    24983    municipio codmunicipio    DEFAULT     �   ALTER TABLE ONLY public.municipio ALTER COLUMN codmunicipio SET DEFAULT nextval('public.municipio_codmunicipio_seq'::regclass);
 E   ALTER TABLE public.municipio ALTER COLUMN codmunicipio DROP DEFAULT;
       public          postgres    false    234    236    236                       2604    24984    municipio codestado    DEFAULT     z   ALTER TABLE ONLY public.municipio ALTER COLUMN codestado SET DEFAULT nextval('public.municipio_codestado_seq'::regclass);
 B   ALTER TABLE public.municipio ALTER COLUMN codestado DROP DEFAULT;
       public          postgres    false    236    235    236                       2604    25208    padece codenfermedad    DEFAULT     |   ALTER TABLE ONLY public.padece ALTER COLUMN codenfermedad SET DEFAULT nextval('public.padece_codenfermedad_seq'::regclass);
 C   ALTER TABLE public.padece ALTER COLUMN codenfermedad DROP DEFAULT;
       public          postgres    false    262    261    262            �           2604    24827    pais cod_pais    DEFAULT     n   ALTER TABLE ONLY public.pais ALTER COLUMN cod_pais SET DEFAULT nextval('public.pais_cod_pais_seq'::regclass);
 <   ALTER TABLE public.pais ALTER COLUMN cod_pais DROP DEFAULT;
       public          postgres    false    211    210    211            	           2604    25042    presenta idvacuna    DEFAULT     v   ALTER TABLE ONLY public.presenta ALTER COLUMN idvacuna SET DEFAULT nextval('public.presenta_idvacuna_seq'::regclass);
 @   ALTER TABLE public.presenta ALTER COLUMN idvacuna DROP DEFAULT;
       public          postgres    false    245    243    245            
           2604    25043    presenta codsintoma    DEFAULT     z   ALTER TABLE ONLY public.presenta ALTER COLUMN codsintoma SET DEFAULT nextval('public.presenta_codsintoma_seq'::regclass);
 B   ALTER TABLE public.presenta ALTER COLUMN codsintoma DROP DEFAULT;
       public          postgres    false    244    245    245                       2604    25119    requiere codtrat    DEFAULT     t   ALTER TABLE ONLY public.requiere ALTER COLUMN codtrat SET DEFAULT nextval('public.requiere_codtrat_seq'::regclass);
 ?   ALTER TABLE public.requiere ALTER COLUMN codtrat DROP DEFAULT;
       public          postgres    false    253    252    253                       2604    25227    reside codestado    DEFAULT     t   ALTER TABLE ONLY public.reside ALTER COLUMN codestado SET DEFAULT nextval('public.reside_codestado_seq'::regclass);
 ?   ALTER TABLE public.reside ALTER COLUMN codestado DROP DEFAULT;
       public          postgres    false    263    264    264            �           2604    24902    sintoma_efecto codsintoma    DEFAULT     �   ALTER TABLE ONLY public.sintoma_efecto ALTER COLUMN codsintoma SET DEFAULT nextval('public.sintoma_efecto_codsintoma_seq'::regclass);
 H   ALTER TABLE public.sintoma_efecto ALTER COLUMN codsintoma DROP DEFAULT;
       public          postgres    false    221    220    221                       2604    25022    tiene codsintoma    DEFAULT     t   ALTER TABLE ONLY public.tiene ALTER COLUMN codsintoma SET DEFAULT nextval('public.tiene_codsintoma_seq'::regclass);
 ?   ALTER TABLE public.tiene ALTER COLUMN codsintoma DROP DEFAULT;
       public          postgres    false    242    241    242                       2604    24973    tratamiento codtrat    DEFAULT     z   ALTER TABLE ONLY public.tratamiento ALTER COLUMN codtrat SET DEFAULT nextval('public.tratamiento_codtrat_seq'::regclass);
 B   ALTER TABLE public.tratamiento ALTER COLUMN codtrat DROP DEFAULT;
       public          postgres    false    233    232    233            �           2604    24922    vacuna idvacuna    DEFAULT     r   ALTER TABLE ONLY public.vacuna ALTER COLUMN idvacuna SET DEFAULT nextval('public.vacuna_idvacuna_seq'::regclass);
 >   ALTER TABLE public.vacuna ALTER COLUMN idvacuna DROP DEFAULT;
       public          postgres    false    226    224    226            �           2604    24923    vacuna codpais    DEFAULT     p   ALTER TABLE ONLY public.vacuna ALTER COLUMN codpais SET DEFAULT nextval('public.vacuna_codpais_seq'::regclass);
 =   ALTER TABLE public.vacuna ALTER COLUMN codpais DROP DEFAULT;
       public          postgres    false    225    226    226                       2604    24998    vacunacion codcentro_vac    DEFAULT     �   ALTER TABLE ONLY public.vacunacion ALTER COLUMN codcentro_vac SET DEFAULT nextval('public.vacunacion_codcentro_vac_seq'::regclass);
 G   ALTER TABLE public.vacunacion ALTER COLUMN codcentro_vac DROP DEFAULT;
       public          postgres    false    237    238    238                       2604    25158    vacunada idvacuna    DEFAULT     v   ALTER TABLE ONLY public.vacunada ALTER COLUMN idvacuna SET DEFAULT nextval('public.vacunada_idvacuna_seq'::regclass);
 @   ALTER TABLE public.vacunada ALTER COLUMN idvacuna DROP DEFAULT;
       public          postgres    false    256    258    258                       2604    25159    vacunada codcentro_vac    DEFAULT     �   ALTER TABLE ONLY public.vacunada ALTER COLUMN codcentro_vac SET DEFAULT nextval('public.vacunada_codcentro_vac_seq'::regclass);
 E   ALTER TABLE public.vacunada ALTER COLUMN codcentro_vac DROP DEFAULT;
       public          postgres    false    258    257    258            �           2604    24888    virus_variante codpais    DEFAULT     �   ALTER TABLE ONLY public.virus_variante ALTER COLUMN codpais SET DEFAULT nextval('public.virus_variante_codpais_seq'::regclass);
 E   ALTER TABLE public.virus_variante ALTER COLUMN codpais DROP DEFAULT;
       public          postgres    false    219    218    219            5          0    25186    asignado 
   TABLE DATA           M   COPY public.asignado (docidentidad_ps, codcentro, fechaasignado) FROM stdin;
    public          postgres    false    260   �$                0    24937    centro_salud 
   TABLE DATA           {   COPY public.centro_salud (codcentro, nombcentro, direccion, docidentidad_encargado, fechaencargado, codestado) FROM stdin;
    public          postgres    false    229   �$      ,          0    25095    consiste 
   TABLE DATA           X   COPY public.consiste (codtrat, codmedicamento, dosis, cantdias, frecuencia) FROM stdin;
    public          postgres    false    251   �%      )          0    25076    contagio 
   TABLE DATA           k   COPY public.contagio (denom_oms, docidentidad, fechacontagio, tiemporeposo, casahospitalizado) FROM stdin;
    public          postgres    false    248    &      (          0    25057    eficaz 
   TABLE DATA           C   COPY public.eficaz (idvacuna, denom_oms, porceficacia) FROM stdin;
    public          postgres    false    247   �&                0    24961 
   enfermedad 
   TABLE DATA           C   COPY public.enfermedad (codenfermedad, nombenfermedad) FROM stdin;
    public          postgres    false    231   
'                0    24834    estado_provincia 
   TABLE DATA           J   COPY public.estado_provincia (codestado, nombestado, codpais) FROM stdin;
    public          postgres    false    214   d'      !          0    25007    hospitalizacion 
   TABLE DATA           8   COPY public.hospitalizacion (codcentro_hos) FROM stdin;
    public          postgres    false    240   �(      0          0    25135    hospitalizado 
   TABLE DATA           \   COPY public.hospitalizado (docidentidad_pac, codcentro_hos, fechahospitalizado) FROM stdin;
    public          postgres    false    255   �(                0    24908    medicamento 
   TABLE DATA           b   COPY public.medicamento (codmedicamento, nombremedicamento, compuesto, concentracion) FROM stdin;
    public          postgres    false    223   �(      	          0    24860    medico 
   TABLE DATA           2   COPY public.medico (docidentidad_med) FROM stdin;
    public          postgres    false    216   �)                0    24980 	   municipio 
   TABLE DATA           K   COPY public.municipio (codmunicipio, nombmunicipio, codestado) FROM stdin;
    public          postgres    false    236   �)      
          0    24872    paciente 
   TABLE DATA           4   COPY public.paciente (docidentidad_pac) FROM stdin;
    public          postgres    false    217   �*      7          0    25205    padece 
   TABLE DATA           =   COPY public.padece (docidentidad, codenfermedad) FROM stdin;
    public          postgres    false    262   T+                0    24824    pais 
   TABLE DATA           2   COPY public.pais (cod_pais, nombpais) FROM stdin;
    public          postgres    false    211   �+                0    24815    persona 
   TABLE DATA           �   COPY public.persona (doc_identidad, nombper, apellidoper, fecha_nac, sexo, direccion_p, n_contacto, alto_riesgo, ocupacion) FROM stdin;
    public          postgres    false    209   �+                0    24848    personal_salud 
   TABLE DATA           _   COPY public.personal_salud (docidentidad_ps, correo, es_asis_medico, es_enfermero) FROM stdin;
    public          postgres    false    215   3      &          0    25039    presenta 
   TABLE DATA           8   COPY public.presenta (idvacuna, codsintoma) FROM stdin;
    public          postgres    false    245   �3      .          0    25116    requiere 
   TABLE DATA           X   COPY public.requiere (docidentidad_pac, codtrat, fecha, estado_tratamiento) FROM stdin;
    public          postgres    false    253   �3      9          0    25224    reside 
   TABLE DATA           F   COPY public.reside (docidentidad, codestado, fechareside) FROM stdin;
    public          postgres    false    264   (4                0    24899    sintoma_efecto 
   TABLE DATA           D   COPY public.sintoma_efecto (codsintoma, descripsintoma) FROM stdin;
    public          postgres    false    221   C5      #          0    25019    tiene 
   TABLE DATA           6   COPY public.tiene (denom_oms, codsintoma) FROM stdin;
    public          postgres    false    242   �5                0    24970    tratamiento 
   TABLE DATA           B   COPY public.tratamiento (codtrat, descriptratamiento) FROM stdin;
    public          postgres    false    233   6                0    24919    vacuna 
   TABLE DATA           c   COPY public.vacuna (idvacuna, lote, nombvacuna, cantdosis, laboratorio, tipo, codpais) FROM stdin;
    public          postgres    false    226   Q6                0    24995 
   vacunacion 
   TABLE DATA           3   COPY public.vacunacion (codcentro_vac) FROM stdin;
    public          postgres    false    238   �6      3          0    25155    vacunada 
   TABLE DATA           n   COPY public.vacunada (docidentidad, idvacuna, codcentro_vac, docidentidad_ps, fechavacuna, dosis) FROM stdin;
    public          postgres    false    258   
7                0    24885    virus_variante 
   TABLE DATA           `   COPY public.virus_variante (denom_oms, linaje, fechaorigen, clasificacion, codpais) FROM stdin;
    public          postgres    false    219   '7      ]           0    0    asignado_codcentro_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.asignado_codcentro_seq', 1, false);
          public          postgres    false    259            ^           0    0    centro_salud_codcentro_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.centro_salud_codcentro_seq', 6, true);
          public          postgres    false    227            _           0    0    centro_salud_codestado_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.centro_salud_codestado_seq', 1, false);
          public          postgres    false    228            `           0    0    consiste_codmedicamento_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.consiste_codmedicamento_seq', 1, false);
          public          postgres    false    250            a           0    0    consiste_codtrat_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.consiste_codtrat_seq', 1, false);
          public          postgres    false    249            b           0    0    eficaz_idvacuna_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.eficaz_idvacuna_seq', 1, false);
          public          postgres    false    246            c           0    0    enfermedad_codenfermedad_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.enfermedad_codenfermedad_seq', 7, true);
          public          postgres    false    230            d           0    0    estado_provincia_codestado_seq    SEQUENCE SET     M   SELECT pg_catalog.setval('public.estado_provincia_codestado_seq', 38, true);
          public          postgres    false    212            e           0    0    estado_provincia_codpais_seq    SEQUENCE SET     K   SELECT pg_catalog.setval('public.estado_provincia_codpais_seq', 1, false);
          public          postgres    false    213            f           0    0 !   hospitalizacion_codcentro_hos_seq    SEQUENCE SET     P   SELECT pg_catalog.setval('public.hospitalizacion_codcentro_hos_seq', 1, false);
          public          postgres    false    239            g           0    0    hospitalizado_codcentro_hos_seq    SEQUENCE SET     N   SELECT pg_catalog.setval('public.hospitalizado_codcentro_hos_seq', 1, false);
          public          postgres    false    254            h           0    0    medicamento_codmedicamento_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public.medicamento_codmedicamento_seq', 4, true);
          public          postgres    false    222            i           0    0    municipio_codestado_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.municipio_codestado_seq', 1, false);
          public          postgres    false    235            j           0    0    municipio_codmunicipio_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.municipio_codmunicipio_seq', 25, true);
          public          postgres    false    234            k           0    0    padece_codenfermedad_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.padece_codenfermedad_seq', 1, false);
          public          postgres    false    261            l           0    0    pais_cod_pais_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.pais_cod_pais_seq', 5, true);
          public          postgres    false    210            m           0    0    presenta_codsintoma_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.presenta_codsintoma_seq', 1, false);
          public          postgres    false    244            n           0    0    presenta_idvacuna_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.presenta_idvacuna_seq', 1, false);
          public          postgres    false    243            o           0    0    requiere_codtrat_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.requiere_codtrat_seq', 1, false);
          public          postgres    false    252            p           0    0    reside_codestado_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.reside_codestado_seq', 1, false);
          public          postgres    false    263            q           0    0    sintoma_efecto_codsintoma_seq    SEQUENCE SET     K   SELECT pg_catalog.setval('public.sintoma_efecto_codsintoma_seq', 6, true);
          public          postgres    false    220            r           0    0    tiene_codsintoma_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.tiene_codsintoma_seq', 1, false);
          public          postgres    false    241            s           0    0    tratamiento_codtrat_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.tratamiento_codtrat_seq', 27, true);
          public          postgres    false    232            t           0    0    vacuna_codpais_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.vacuna_codpais_seq', 1, false);
          public          postgres    false    225            u           0    0    vacuna_idvacuna_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.vacuna_idvacuna_seq', 58, true);
          public          postgres    false    224            v           0    0    vacunacion_codcentro_vac_seq    SEQUENCE SET     K   SELECT pg_catalog.setval('public.vacunacion_codcentro_vac_seq', 1, false);
          public          postgres    false    237            w           0    0    vacunada_codcentro_vac_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.vacunada_codcentro_vac_seq', 1, false);
          public          postgres    false    257            x           0    0    vacunada_idvacuna_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.vacunada_idvacuna_seq', 1, false);
          public          postgres    false    256            y           0    0    virus_variante_codpais_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.virus_variante_codpais_seq', 1, false);
          public          postgres    false    218            O           2606    25193    asignado asignado_pkey 
   CONSTRAINT     {   ALTER TABLE ONLY public.asignado
    ADD CONSTRAINT asignado_pkey PRIMARY KEY (docidentidad_ps, codcentro, fechaasignado);
 @   ALTER TABLE ONLY public.asignado DROP CONSTRAINT asignado_pkey;
       public            postgres    false    260    260    260            /           2606    24947 '   centro_salud centro_salud_codcentro_key 
   CONSTRAINT     g   ALTER TABLE ONLY public.centro_salud
    ADD CONSTRAINT centro_salud_codcentro_key UNIQUE (codcentro);
 Q   ALTER TABLE ONLY public.centro_salud DROP CONSTRAINT centro_salud_codcentro_key;
       public            postgres    false    229            1           2606    24949 ,   centro_salud centro_salud_fechaencargado_key 
   CONSTRAINT     q   ALTER TABLE ONLY public.centro_salud
    ADD CONSTRAINT centro_salud_fechaencargado_key UNIQUE (fechaencargado);
 V   ALTER TABLE ONLY public.centro_salud DROP CONSTRAINT centro_salud_fechaencargado_key;
       public            postgres    false    229            3           2606    24945    centro_salud centro_salud_pkey 
   CONSTRAINT     s   ALTER TABLE ONLY public.centro_salud
    ADD CONSTRAINT centro_salud_pkey PRIMARY KEY (codcentro, fechaencargado);
 H   ALTER TABLE ONLY public.centro_salud DROP CONSTRAINT centro_salud_pkey;
       public            postgres    false    229    229            =           2606    25012 "   hospitalizacion codcentro_hos_pkey 
   CONSTRAINT     k   ALTER TABLE ONLY public.hospitalizacion
    ADD CONSTRAINT codcentro_hos_pkey PRIMARY KEY (codcentro_hos);
 L   ALTER TABLE ONLY public.hospitalizacion DROP CONSTRAINT codcentro_hos_pkey;
       public            postgres    false    240            5           2606    24968    enfermedad codenfermedad_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.enfermedad
    ADD CONSTRAINT codenfermedad_pkey PRIMARY KEY (codenfermedad);
 G   ALTER TABLE ONLY public.enfermedad DROP CONSTRAINT codenfermedad_pkey;
       public            postgres    false    231            9           2606    24988    municipio codmunicipio_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.municipio
    ADD CONSTRAINT codmunicipio_pkey PRIMARY KEY (codmunicipio);
 E   ALTER TABLE ONLY public.municipio DROP CONSTRAINT codmunicipio_pkey;
       public            postgres    false    236            7           2606    24977    tratamiento codtrat_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.tratamiento
    ADD CONSTRAINT codtrat_pkey PRIMARY KEY (codtrat);
 B   ALTER TABLE ONLY public.tratamiento DROP CONSTRAINT codtrat_pkey;
       public            postgres    false    233            ;           2606    25000    vacunacion codvacunacion_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.vacunacion
    ADD CONSTRAINT codvacunacion_pkey PRIMARY KEY (codcentro_vac);
 G   ALTER TABLE ONLY public.vacunacion DROP CONSTRAINT codvacunacion_pkey;
       public            postgres    false    238            G           2606    25104    consiste consiste_pkey 
   CONSTRAINT     i   ALTER TABLE ONLY public.consiste
    ADD CONSTRAINT consiste_pkey PRIMARY KEY (codtrat, codmedicamento);
 @   ALTER TABLE ONLY public.consiste DROP CONSTRAINT consiste_pkey;
       public            postgres    false    251    251            E           2606    25082    contagio contagio_pkey 
   CONSTRAINT     x   ALTER TABLE ONLY public.contagio
    ADD CONSTRAINT contagio_pkey PRIMARY KEY (denom_oms, docidentidad, fechacontagio);
 @   ALTER TABLE ONLY public.contagio DROP CONSTRAINT contagio_pkey;
       public            postgres    false    248    248    248            #           2606    24866    medico docidentidad_med_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY public.medico
    ADD CONSTRAINT docidentidad_med_pkey PRIMARY KEY (docidentidad_med);
 F   ALTER TABLE ONLY public.medico DROP CONSTRAINT docidentidad_med_pkey;
       public            postgres    false    216            C           2606    25065    eficaz eficaz_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.eficaz
    ADD CONSTRAINT eficaz_pkey PRIMARY KEY (idvacuna, denom_oms);
 <   ALTER TABLE ONLY public.eficaz DROP CONSTRAINT eficaz_pkey;
       public            postgres    false    247    247                       2606    24842 &   estado_provincia estado_provincia_pkey 
   CONSTRAINT     k   ALTER TABLE ONLY public.estado_provincia
    ADD CONSTRAINT estado_provincia_pkey PRIMARY KEY (codestado);
 P   ALTER TABLE ONLY public.estado_provincia DROP CONSTRAINT estado_provincia_pkey;
       public            postgres    false    214            K           2606    25142     hospitalizado hospitalizado_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY public.hospitalizado
    ADD CONSTRAINT hospitalizado_pkey PRIMARY KEY (docidentidad_pac, codcentro_hos, fechahospitalizado);
 J   ALTER TABLE ONLY public.hospitalizado DROP CONSTRAINT hospitalizado_pkey;
       public            postgres    false    255    255    255            +           2606    24916    medicamento medicamento_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.medicamento
    ADD CONSTRAINT medicamento_pkey PRIMARY KEY (codmedicamento);
 F   ALTER TABLE ONLY public.medicamento DROP CONSTRAINT medicamento_pkey;
       public            postgres    false    223            %           2606    24878    paciente paciente_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.paciente
    ADD CONSTRAINT paciente_pkey PRIMARY KEY (docidentidad_pac);
 @   ALTER TABLE ONLY public.paciente DROP CONSTRAINT paciente_pkey;
       public            postgres    false    217            Q           2606    25212    padece padece_pkey 
   CONSTRAINT     i   ALTER TABLE ONLY public.padece
    ADD CONSTRAINT padece_pkey PRIMARY KEY (docidentidad, codenfermedad);
 <   ALTER TABLE ONLY public.padece DROP CONSTRAINT padece_pkey;
       public            postgres    false    262    262                       2606    24831    pais pais_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.pais
    ADD CONSTRAINT pais_pkey PRIMARY KEY (cod_pais);
 8   ALTER TABLE ONLY public.pais DROP CONSTRAINT pais_pkey;
       public            postgres    false    211                       2606    24822    persona persona_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.persona
    ADD CONSTRAINT persona_pkey PRIMARY KEY (doc_identidad);
 >   ALTER TABLE ONLY public.persona DROP CONSTRAINT persona_pkey;
       public            postgres    false    209            !           2606    24854 %   personal_salud personal_de_salud_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public.personal_salud
    ADD CONSTRAINT personal_de_salud_pkey PRIMARY KEY (docidentidad_ps);
 O   ALTER TABLE ONLY public.personal_salud DROP CONSTRAINT personal_de_salud_pkey;
       public            postgres    false    215            A           2606    25045    presenta presenta_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.presenta
    ADD CONSTRAINT presenta_pkey PRIMARY KEY (idvacuna, codsintoma);
 @   ALTER TABLE ONLY public.presenta DROP CONSTRAINT presenta_pkey;
       public            postgres    false    245    245            I           2606    25123    requiere requiere_pkey 
   CONSTRAINT     r   ALTER TABLE ONLY public.requiere
    ADD CONSTRAINT requiere_pkey PRIMARY KEY (docidentidad_pac, codtrat, fecha);
 @   ALTER TABLE ONLY public.requiere DROP CONSTRAINT requiere_pkey;
       public            postgres    false    253    253    253            S           2606    25231    reside reside_pkey 
   CONSTRAINT     r   ALTER TABLE ONLY public.reside
    ADD CONSTRAINT reside_pkey PRIMARY KEY (docidentidad, codestado, fechareside);
 <   ALTER TABLE ONLY public.reside DROP CONSTRAINT reside_pkey;
       public            postgres    false    264    264    264            )           2606    24906 "   sintoma_efecto sintoma_efecto_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY public.sintoma_efecto
    ADD CONSTRAINT sintoma_efecto_pkey PRIMARY KEY (codsintoma);
 L   ALTER TABLE ONLY public.sintoma_efecto DROP CONSTRAINT sintoma_efecto_pkey;
       public            postgres    false    221            ?           2606    25026    tiene tiene_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.tiene
    ADD CONSTRAINT tiene_pkey PRIMARY KEY (denom_oms, codsintoma);
 :   ALTER TABLE ONLY public.tiene DROP CONSTRAINT tiene_pkey;
       public            postgres    false    242    242            -           2606    24929    vacuna vacuna_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.vacuna
    ADD CONSTRAINT vacuna_pkey PRIMARY KEY (idvacuna);
 <   ALTER TABLE ONLY public.vacuna DROP CONSTRAINT vacuna_pkey;
       public            postgres    false    226            M           2606    25164    vacunada vacunada_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY public.vacunada
    ADD CONSTRAINT vacunada_pkey PRIMARY KEY (docidentidad, idvacuna, codcentro_vac, docidentidad_ps, dosis);
 @   ALTER TABLE ONLY public.vacunada DROP CONSTRAINT vacunada_pkey;
       public            postgres    false    258    258    258    258    258            '           2606    24892 "   virus_variante virus_variante_pkey 
   CONSTRAINT     g   ALTER TABLE ONLY public.virus_variante
    ADD CONSTRAINT virus_variante_pkey PRIMARY KEY (denom_oms);
 L   ALTER TABLE ONLY public.virus_variante DROP CONSTRAINT virus_variante_pkey;
       public            postgres    false    219            Z           2606    24950 #   centro_salud fk_centro_salud_estado    FK CONSTRAINT     �   ALTER TABLE ONLY public.centro_salud
    ADD CONSTRAINT fk_centro_salud_estado FOREIGN KEY (codestado) REFERENCES public.estado_provincia(codestado);
 M   ALTER TABLE ONLY public.centro_salud DROP CONSTRAINT fk_centro_salud_estado;
       public          postgres    false    214    3359    229            [           2606    24955 #   centro_salud fk_centro_salud_medico    FK CONSTRAINT     �   ALTER TABLE ONLY public.centro_salud
    ADD CONSTRAINT fk_centro_salud_medico FOREIGN KEY (docidentidad_encargado) REFERENCES public.medico(docidentidad_med);
 M   ALTER TABLE ONLY public.centro_salud DROP CONSTRAINT fk_centro_salud_medico;
       public          postgres    false    216    3363    229            q           2606    25194    asignado fk_codcentro    FK CONSTRAINT     �   ALTER TABLE ONLY public.asignado
    ADD CONSTRAINT fk_codcentro FOREIGN KEY (codcentro) REFERENCES public.centro_salud(codcentro);
 ?   ALTER TABLE ONLY public.asignado DROP CONSTRAINT fk_codcentro;
       public          postgres    false    3375    260    229            k           2606    25143    hospitalizado fk_codcentro_hos    FK CONSTRAINT     �   ALTER TABLE ONLY public.hospitalizado
    ADD CONSTRAINT fk_codcentro_hos FOREIGN KEY (codcentro_hos) REFERENCES public.hospitalizacion(codcentro_hos);
 H   ALTER TABLE ONLY public.hospitalizado DROP CONSTRAINT fk_codcentro_hos;
       public          postgres    false    240    255    3389            m           2606    25165    vacunada fk_codcentro_vac    FK CONSTRAINT     �   ALTER TABLE ONLY public.vacunada
    ADD CONSTRAINT fk_codcentro_vac FOREIGN KEY (codcentro_vac) REFERENCES public.vacunacion(codcentro_vac);
 C   ALTER TABLE ONLY public.vacunada DROP CONSTRAINT fk_codcentro_vac;
       public          postgres    false    238    258    3387            s           2606    25213    padece fk_codenfermedad    FK CONSTRAINT     �   ALTER TABLE ONLY public.padece
    ADD CONSTRAINT fk_codenfermedad FOREIGN KEY (codenfermedad) REFERENCES public.enfermedad(codenfermedad);
 A   ALTER TABLE ONLY public.padece DROP CONSTRAINT fk_codenfermedad;
       public          postgres    false    231    3381    262            u           2606    25232    reside fk_codestado    FK CONSTRAINT     �   ALTER TABLE ONLY public.reside
    ADD CONSTRAINT fk_codestado FOREIGN KEY (codestado) REFERENCES public.estado_provincia(codestado);
 =   ALTER TABLE ONLY public.reside DROP CONSTRAINT fk_codestado;
       public          postgres    false    214    3359    264            g           2606    25105    consiste fk_codmedicamento    FK CONSTRAINT     �   ALTER TABLE ONLY public.consiste
    ADD CONSTRAINT fk_codmedicamento FOREIGN KEY (codmedicamento) REFERENCES public.medicamento(codmedicamento);
 D   ALTER TABLE ONLY public.consiste DROP CONSTRAINT fk_codmedicamento;
       public          postgres    false    251    223    3371            _           2606    25027    tiene fk_codsintoma    FK CONSTRAINT     �   ALTER TABLE ONLY public.tiene
    ADD CONSTRAINT fk_codsintoma FOREIGN KEY (codsintoma) REFERENCES public.sintoma_efecto(codsintoma);
 =   ALTER TABLE ONLY public.tiene DROP CONSTRAINT fk_codsintoma;
       public          postgres    false    3369    242    221            a           2606    25046    presenta fk_codsintoma    FK CONSTRAINT     �   ALTER TABLE ONLY public.presenta
    ADD CONSTRAINT fk_codsintoma FOREIGN KEY (codsintoma) REFERENCES public.sintoma_efecto(codsintoma);
 @   ALTER TABLE ONLY public.presenta DROP CONSTRAINT fk_codsintoma;
       public          postgres    false    245    3369    221            h           2606    25110    consiste fk_codtrat    FK CONSTRAINT     }   ALTER TABLE ONLY public.consiste
    ADD CONSTRAINT fk_codtrat FOREIGN KEY (codtrat) REFERENCES public.tratamiento(codtrat);
 =   ALTER TABLE ONLY public.consiste DROP CONSTRAINT fk_codtrat;
       public          postgres    false    251    233    3383            i           2606    25124    requiere fk_codtrat    FK CONSTRAINT     }   ALTER TABLE ONLY public.requiere
    ADD CONSTRAINT fk_codtrat FOREIGN KEY (codtrat) REFERENCES public.tratamiento(codtrat);
 =   ALTER TABLE ONLY public.requiere DROP CONSTRAINT fk_codtrat;
       public          postgres    false    3383    253    233            `           2606    25032    tiene fk_denom_oms    FK CONSTRAINT     �   ALTER TABLE ONLY public.tiene
    ADD CONSTRAINT fk_denom_oms FOREIGN KEY (denom_oms) REFERENCES public.virus_variante(denom_oms);
 <   ALTER TABLE ONLY public.tiene DROP CONSTRAINT fk_denom_oms;
       public          postgres    false    3367    242    219            c           2606    25066    eficaz fk_denom_oms    FK CONSTRAINT     �   ALTER TABLE ONLY public.eficaz
    ADD CONSTRAINT fk_denom_oms FOREIGN KEY (denom_oms) REFERENCES public.virus_variante(denom_oms);
 =   ALTER TABLE ONLY public.eficaz DROP CONSTRAINT fk_denom_oms;
       public          postgres    false    219    3367    247            e           2606    25083    contagio fk_denom_oms    FK CONSTRAINT     �   ALTER TABLE ONLY public.contagio
    ADD CONSTRAINT fk_denom_oms FOREIGN KEY (denom_oms) REFERENCES public.virus_variante(denom_oms);
 ?   ALTER TABLE ONLY public.contagio DROP CONSTRAINT fk_denom_oms;
       public          postgres    false    219    3367    248            f           2606    25088    contagio fk_docidentidad    FK CONSTRAINT     �   ALTER TABLE ONLY public.contagio
    ADD CONSTRAINT fk_docidentidad FOREIGN KEY (docidentidad) REFERENCES public.persona(doc_identidad);
 B   ALTER TABLE ONLY public.contagio DROP CONSTRAINT fk_docidentidad;
       public          postgres    false    3355    248    209            n           2606    25170    vacunada fk_docidentidad    FK CONSTRAINT     �   ALTER TABLE ONLY public.vacunada
    ADD CONSTRAINT fk_docidentidad FOREIGN KEY (docidentidad) REFERENCES public.persona(doc_identidad);
 B   ALTER TABLE ONLY public.vacunada DROP CONSTRAINT fk_docidentidad;
       public          postgres    false    258    3355    209            t           2606    25218    padece fk_docidentidad    FK CONSTRAINT     �   ALTER TABLE ONLY public.padece
    ADD CONSTRAINT fk_docidentidad FOREIGN KEY (docidentidad) REFERENCES public.persona(doc_identidad);
 @   ALTER TABLE ONLY public.padece DROP CONSTRAINT fk_docidentidad;
       public          postgres    false    262    3355    209            v           2606    25237    reside fk_docidentidad    FK CONSTRAINT     �   ALTER TABLE ONLY public.reside
    ADD CONSTRAINT fk_docidentidad FOREIGN KEY (docidentidad) REFERENCES public.persona(doc_identidad);
 @   ALTER TABLE ONLY public.reside DROP CONSTRAINT fk_docidentidad;
       public          postgres    false    3355    209    264            j           2606    25129    requiere fk_docidentidad_pac    FK CONSTRAINT     �   ALTER TABLE ONLY public.requiere
    ADD CONSTRAINT fk_docidentidad_pac FOREIGN KEY (docidentidad_pac) REFERENCES public.paciente(docidentidad_pac);
 F   ALTER TABLE ONLY public.requiere DROP CONSTRAINT fk_docidentidad_pac;
       public          postgres    false    217    253    3365            l           2606    25148 !   hospitalizado fk_docidentidad_pac    FK CONSTRAINT     �   ALTER TABLE ONLY public.hospitalizado
    ADD CONSTRAINT fk_docidentidad_pac FOREIGN KEY (docidentidad_pac) REFERENCES public.paciente(docidentidad_pac);
 K   ALTER TABLE ONLY public.hospitalizado DROP CONSTRAINT fk_docidentidad_pac;
       public          postgres    false    3365    217    255            o           2606    25175    vacunada fk_docidentidad_ps    FK CONSTRAINT     �   ALTER TABLE ONLY public.vacunada
    ADD CONSTRAINT fk_docidentidad_ps FOREIGN KEY (docidentidad_ps) REFERENCES public.personal_salud(docidentidad_ps);
 E   ALTER TABLE ONLY public.vacunada DROP CONSTRAINT fk_docidentidad_ps;
       public          postgres    false    215    3361    258            r           2606    25199    asignado fk_docidentidad_ps    FK CONSTRAINT     �   ALTER TABLE ONLY public.asignado
    ADD CONSTRAINT fk_docidentidad_ps FOREIGN KEY (docidentidad_ps) REFERENCES public.personal_salud(docidentidad_ps);
 E   ALTER TABLE ONLY public.asignado DROP CONSTRAINT fk_docidentidad_ps;
       public          postgres    false    215    3361    260            T           2606    24843 $   estado_provincia fk_estado_provincia    FK CONSTRAINT     �   ALTER TABLE ONLY public.estado_provincia
    ADD CONSTRAINT fk_estado_provincia FOREIGN KEY (codpais) REFERENCES public.pais(cod_pais);
 N   ALTER TABLE ONLY public.estado_provincia DROP CONSTRAINT fk_estado_provincia;
       public          postgres    false    211    214    3357            ^           2606    25013 "   hospitalizacion fk_hospitalizacion    FK CONSTRAINT     �   ALTER TABLE ONLY public.hospitalizacion
    ADD CONSTRAINT fk_hospitalizacion FOREIGN KEY (codcentro_hos) REFERENCES public.centro_salud(codcentro);
 L   ALTER TABLE ONLY public.hospitalizacion DROP CONSTRAINT fk_hospitalizacion;
       public          postgres    false    240    3375    229            b           2606    25051    presenta fk_idvacuna    FK CONSTRAINT     {   ALTER TABLE ONLY public.presenta
    ADD CONSTRAINT fk_idvacuna FOREIGN KEY (idvacuna) REFERENCES public.vacuna(idvacuna);
 >   ALTER TABLE ONLY public.presenta DROP CONSTRAINT fk_idvacuna;
       public          postgres    false    245    3373    226            d           2606    25071    eficaz fk_idvacuna    FK CONSTRAINT     y   ALTER TABLE ONLY public.eficaz
    ADD CONSTRAINT fk_idvacuna FOREIGN KEY (idvacuna) REFERENCES public.vacuna(idvacuna);
 <   ALTER TABLE ONLY public.eficaz DROP CONSTRAINT fk_idvacuna;
       public          postgres    false    247    3373    226            p           2606    25180    vacunada fk_idvacuna    FK CONSTRAINT     {   ALTER TABLE ONLY public.vacunada
    ADD CONSTRAINT fk_idvacuna FOREIGN KEY (idvacuna) REFERENCES public.vacuna(idvacuna);
 >   ALTER TABLE ONLY public.vacunada DROP CONSTRAINT fk_idvacuna;
       public          postgres    false    3373    258    226            V           2606    24867    medico fk_medico    FK CONSTRAINT     �   ALTER TABLE ONLY public.medico
    ADD CONSTRAINT fk_medico FOREIGN KEY (docidentidad_med) REFERENCES public.personal_salud(docidentidad_ps);
 :   ALTER TABLE ONLY public.medico DROP CONSTRAINT fk_medico;
       public          postgres    false    3361    216    215            \           2606    24989    municipio fk_municipio    FK CONSTRAINT     �   ALTER TABLE ONLY public.municipio
    ADD CONSTRAINT fk_municipio FOREIGN KEY (codestado) REFERENCES public.estado_provincia(codestado);
 @   ALTER TABLE ONLY public.municipio DROP CONSTRAINT fk_municipio;
       public          postgres    false    3359    214    236            U           2606    24855    personal_salud fk_persona    FK CONSTRAINT     �   ALTER TABLE ONLY public.personal_salud
    ADD CONSTRAINT fk_persona FOREIGN KEY (docidentidad_ps) REFERENCES public.persona(doc_identidad);
 C   ALTER TABLE ONLY public.personal_salud DROP CONSTRAINT fk_persona;
       public          postgres    false    3355    215    209            W           2606    24879    paciente fk_persona    FK CONSTRAINT     �   ALTER TABLE ONLY public.paciente
    ADD CONSTRAINT fk_persona FOREIGN KEY (docidentidad_pac) REFERENCES public.persona(doc_identidad);
 =   ALTER TABLE ONLY public.paciente DROP CONSTRAINT fk_persona;
       public          postgres    false    3355    217    209            ]           2606    25001    vacunacion fk_vacunacion    FK CONSTRAINT     �   ALTER TABLE ONLY public.vacunacion
    ADD CONSTRAINT fk_vacunacion FOREIGN KEY (codcentro_vac) REFERENCES public.centro_salud(codcentro);
 B   ALTER TABLE ONLY public.vacunacion DROP CONSTRAINT fk_vacunacion;
       public          postgres    false    238    229    3375            Y           2606    24930    vacuna vacuna_fktest    FK CONSTRAINT     x   ALTER TABLE ONLY public.vacuna
    ADD CONSTRAINT vacuna_fktest FOREIGN KEY (codpais) REFERENCES public.pais(cod_pais);
 >   ALTER TABLE ONLY public.vacuna DROP CONSTRAINT vacuna_fktest;
       public          postgres    false    211    3357    226            X           2606    24893 $   virus_variante virus_variante_fktest    FK CONSTRAINT     �   ALTER TABLE ONLY public.virus_variante
    ADD CONSTRAINT virus_variante_fktest FOREIGN KEY (codpais) REFERENCES public.pais(cod_pais);
 N   ALTER TABLE ONLY public.virus_variante DROP CONSTRAINT virus_variante_fktest;
       public          postgres    false    211    219    3357            5   $   x�340�447��4�4202�50�54����� M�           x�e�AR�0E��)t�8c;n�,�ЁE��Ȋ�I�q�"'�މSp1�+����n��)�>D|���b�;�'J���-�Rm@g�[^�؇w�evg�s\�C�I�tZ�j��B*�K��n�q���g7Z�f���Ȕ�Mæ6�f[&�N�P2�����$����Dq��+M��Y:��'~���K��Q�Ysh)d-�J����sJ�xG3�S�	9�e�'�*}��^
��f���i���\`kv�K��Ԧ.�_��Oާ"˲o��gW      ,   1   x��� �sR��Y,���6�0 ̀�ݭ�f��4�ǧ�����      )   q   x�}�1�0��/����<��hB�@�	��´������g�m�9���@iX]p��k�iV�C�&��)!���ֽ���=���pG��@�S�@�f*4{}ҩ��_ /6�      (   Y   x�31�t�)�H�41�21��--��¦P�����Zg�%e&敤*��&�t����ss9M@l�Ԝ����<N�=... �~          J   x�3�t�LLJ-I-�2�t,�M�2�t,*)�,�,�2�t>�0/9��˔�=�*j��Z�Xf�s�yzp��qqq _�*         I  x�Q�N�0<��"_�����1-jj��J�e�X���+')|>k�f����hM �r���4�%hF%>kb��),��Z�E��hb�Fc�L#A��[o}���*�^�Л4�x�hH}���$T�����y�mgʚ�.K�g�
o͍B,VhfKnNl5Zr�AO���'��r��,a0�#��q�z�%)�F>;��
!ku�V
Y`h2�)J��u:{"�MH������q}�g��}��o�x�i0nf�X�9�!1)�B�xA�ʎ��ԗl���R
;,F �*�#{���D{]Fb�=E�
3^�5ѭ�
'�m�0>"���{���N���~)      !      x�3�2����� l       0      x������ � �         �   x�e̽�0��7 ���"�Db�KrF'9��sDY�����?�ʝ�i��˴��Ȅ1s���a�iS��y`CV�d4��^��2� �#>�Hu��g������Uy��W�gk��=#H��{O�5�\�8)      	   6   x�ȱ  ���1�/>�P��R]r�F�,�}��D���S�嬩��-��%c
Y           x�]�;N1���)|�}&)�H[�D���f�k#�-���q��[P ���1C�������S��G�(a�Ɛ�(;m-;tҌ�5t�xG�@��#j�1�ù�X��n�:���_�[b�?�H+�E7j�� �P�<4��E�d�Y�#�4 �����\S��LY4$f��t-o�fU�XSp��)!���X�����AG��*_�L�9cw>�E�ww�VT�\��}^�y��f�����G�EY�:����B��mB��X�pH���G��1_4�Ӎ�)Mw�      
   M   x�-���0�������H^��:Qy���D8W�f-v�J9��)�n{@ҿj����캥�@�5b:qT����>f�f	�      7   (   x�340�447��4�
3�06�010Ga!���b���� U	�         L   x�3�K�K�*M�I�2�t-.IL�/V��R\Ɯ�y�9�%�EE�\&�NE�ř9\����)��e&'r��qqq E           x��X�n�H]W�B�Ek��vz2ִ'J`6e�lӠYi>���^d1�]o�c}n���Tx��}�se�%S�>܇���!0�9�r5�)[�y(��Փ��n2wE~�2wo����,]ٸ��Uw����|���<L�y�T�3�RK�8��ݲ�i�9�ƿ��6����}����->���)�Si���������kzPM�¤���3S"�ܰ�+[_��]��"X1����r����6K����FR��S�+�1<��q:5j ͞|�����b�G��R!י9�C͞�2Gaú��Z�̄MR�ME2�V�������+��T(���X��<�j��֤�$ȵc�T7X��,+1�W�2.�+�J�^~��B��he��>�W��ɺ��讂��aD�����W'D�q{<n��-��U��Y������y�IW.���j����X��R�1j�hvI� �w[L!0`�ݭoЂ¾e��֒:��Yw-�,S���ү=M�l*_m�@?��
��������ۥ9&�!����|��ڱk��kGZY�`<�m��&���oRA�nP���F�.!�����W��ꍎ� �c��Yل2�we8�:�GI2m�hB����(K���.�'06L�B���f\ѓ㬆bxj���T�O�jɚ�n��ȉc2���QR�i�՛�A���������$A�v�������a9V���z�
k�)Oh���N��|Kğ�Q�P�?�`���:E�jG��U޳]v�Dіk�!5���}�MG�F)��!���?m�Z*�^ѩ��k��q�'��:��h�YU�J���J���ge��EG��ƕ$�*_��T}�����[�cz~Jl�L�.(����%w1�B�޷ybT]q D:��uxIB�Vl~_a̐Ӟ���_��0M
�[�f���^$��v��a	����Ϗ8<׮�W�g�L��'R0E�hţP��W��M�T~m���[4x�+��^:�Q[O�튌�^�t �U!$v���r*_����8`-ݢP9=�4}�J'�ʭ{J(;$#��
�[̩ɇ.���]´�).��uP� �E����d�t���h��Ums�O�ZԆ�-|]�lޮ�A�̷I%��a������C������5e$�k�N�^}��3���2}v� 7bN�y�1�	���E��?]�5<i̜�0'q`N�А�X�ؑ/�Fm�b+���a;By�dkL�n�����A'��oy���K1oNQ�?��
1�S�
����t�D ��T�u^��1�E���Тc{�1��-J�Y�O>*n�Qi�Qc��A���~�\'��egT�m^wF�+��Qu|�B���*���������"	��QD��ά��Mq`U�ت d��IәUW�Ϋ��W+Ǝh6���,&�k�����}ˢ��M���[<�=���;�568�u�u��2�9WG�o����R1
,���~HOf��&�,�Vta ���v�va�� ��q��{�,��6�GJ��}��Aj�.8��	ޛ����4p�n!����7h��V��4�d�"��"ՉL�{��>�Vȵ�̺���ߎ��e��[>d��0p1p�tb�ɲ�R�=.N�G2*=�%������G�s,\��h�`�B�����5��ǃA`�wť_�u_VdC�v�ɥĎة{�Ԯ|�}OA��;���Cqwm���4D�ER dك  �m�C(��[������+��W�L��}�A��p���;���X�Ff �����Q�#�@�������NK+3I���8�h�������͛7�(O         �   x�u�A� ���p�(���]��`@�Ğ^������EpŅ�B����Ǔ��O��r�6��N����x�����&��4�����!��PVC��Dkp�(�2ʌ�?Ur���6��4��B�}Z��c��B�      &   *   x�3��4�2��4& �D�qq�r��%Ḿ�1z\\\ �
      .   C   x�3�43NCN###]3]C#N�<��Ң�|�0#Sc#3KN#dy�̼Ĝ̪Ĕ|�=... +J      9     x�u�Ar�0C��]�.�U�����?�&Y�h�$|�ϔL �y}���O�	�iDl4�Y\�1�a#�1N�R���c�:�h�M�z�O7��./���&���,w�b��0dR����SDV�������[����rտ�6<��T����0)��hٙf��li���pM �E�JTzus���T�I��a�P�>$DPfz������{m���>;K�R�˖�U�r9��o��.߹ĸ(�S����湊�dG����q�{��$         d   x�3�t���/RHIUHNLJ�J�2�8��(%3%(���^Z\��e�*����5�j�--N.�I,�2�t-NN��O+:�6��ˌ3fx*Д���|�=... ��(u      #   L   x�sO��M�4�rJ-I�4�rI�)IL.��
9�d$rBi�I�WYbQfb^I�BAQijH��S�=... �%�         .   x�3�)J,I��L�+�W0�2D�r�!�p��(0����� �u         �   x�]�;
1E��f���Ø�J!X��&)��y��U���4Gm!�7J
�����2�X莙I	K�':���]Zr¹�z��|��Rr�Qg'{Y���B�O�A���2gRCec���j����1��j1�            x�3�2����� �$      3      x������ � �         {   x�s�)�H�t�3BsN##]K]C�0gNc.������!D�� &k�垘�����2�äL�\RsJ����8-@�F��`�P_�tYbQfb^I�BAQijR"g�!��F\1z\\\ G<$^     