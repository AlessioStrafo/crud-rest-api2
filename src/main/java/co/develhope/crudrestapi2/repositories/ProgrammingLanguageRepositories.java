package co.develhope.crudrestapi2.repositories;

import co.develhope.crudrestapi2.entity.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo_prog_languages",
        collectionResourceDescription = @Description("this is the repo_prog_languages description"),
        collectionResourceRel = "programming language",
        itemResourceDescription = @Description("single programming language description"))
public interface ProgrammingLanguageRepositories extends JpaRepository<ProgrammingLanguage, Long> {
}
