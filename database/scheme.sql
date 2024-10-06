CREATE TABLE IF NOT EXISTS challenge (
    id              serial PRIMARY KEY,
    name            VARCHAR(80),
    description     VARCHAR(500)
);


CREATE TABLE IF NOT EXISTS benchmark (
    id              serial PRIMARY KEY,
    name            VARCHAR(80),
    description     VARCHAR(300),
    code            BYTEA,
    challengeId     INTEGER REFERENCES challenge(id)
);

INSERT INTO challenge (name,description) VALUES
    ('FirstChallenge', 'Very Hard'),
    ('Second Challenge', 'even harder');

INSERT INTO benchmark (name,description,code,challengeId) VALUES
    ('Emilio', 'Test', 'print("Hello World!")',1),
    ('Alex', 'Test2', 'print("Hello World")',1);

SELECT * FROM benchmark

DROP TABLE benchmark;
