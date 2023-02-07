CREATE TABLE [dbo].[user] (
    [id]       VARCHAR (50)   NOT NULL,
    [password] NVARCHAR (MAX) NOT NULL,
    [name]     NVARCHAR (50)  NOT NULL,
    [email]    NVARCHAR (MAX) NOT NULL,
    [phone]    VARCHAR (50)   NOT NULL,
    CONSTRAINT [PK_user] PRIMARY KEY CLUSTERED ([id] ASC)
);