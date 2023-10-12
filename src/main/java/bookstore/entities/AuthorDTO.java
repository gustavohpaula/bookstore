package bookstore.entities;

import java.util.Objects;

public class AuthorDTO
{
	private String name;
	private String email;
	private String cpf;

	public AuthorDTO()
	{
	}

	public AuthorDTO(String name, String email, String cpf)
	{
		this.name = name;
		this.email = email;
		this.cpf = cpf;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		AuthorDTO authorDTO = (AuthorDTO) o;
		return Objects.equals(name, authorDTO.name) && Objects.equals(email, authorDTO.email)
			&& Objects.equals(cpf, authorDTO.cpf);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(name, email, cpf);
	}

	@Override
	public String toString()
	{
		return "AuthorDTO{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", cpf='" + cpf
			+ '\'' + '}';
	}
}
