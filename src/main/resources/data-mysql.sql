--
-- Déchargement des données de la table `pays`
--

INSERT INTO `competence` (`id`, `nom`) VALUES
(1, 'Développeur'),
(2, 'Comptable');

INSERT INTO `pays` (`id`, `nom`) VALUES
(1, 'France'),
(2, 'Allemagne');

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `nom`, `prenom`, `pays_id`) VALUES
(1, 'Smith', 'Steeve', 1),
(2, 'Doe', 'John', 2),
(3, 'BANSEPT', 'Franck', 1);

INSERT INTO `competence_utilisateur` (`utilisateur_id`, `competence_id`) VALUES
(1, 1),
(1, 2),
(2, 2),
(3, 1);