String message = ("Aqui será calculado o imc");
	JOptionPane.showMessageDialog(null, message);

	Scanner input = new Scanner(System.in);

	System.out.print("Defina seu sexo \n Para masculino digite [1]. \n Para feminino digite [2]. \n");		
	sexo = input.nextInt(); // salva na váriavel sexo.
	nome_sexo = sexo;
		
	if (nome_sexo == 1)
	{
		System.out.print("-  masculino!");
	}

	if (nome_sexo == 2)
	{
		System.out.print("- feminino!");
	}

	System.out.print("\n\n Qual é o seu peso [Exemplo: 60,5]?\n");		
	peso = input.nextDouble(); // salva na váriavel peso.
	System.out.printf("- O seu peso é: %6.1f kilogramas!", peso);

	System.out.print("\n\n Qual é a sua altura [Exemplo: 1,70]?\n");		
	altura = input.nextDouble(); // salva na váriavel altura.
	System.out.printf("- A sua altura é: %6.2f metros!", altura);

	calcular_IMC = peso / ((altura)*(altura)); // calcula o valor do IMC

	if (sexo == 1)
	{
		if (calcular_IMC < h_imc[0])
		{
			System.out.print("\n\n Resultado IMC (Masculino):");
			System.out.printf("\n- O seu IMC é: %6.1f. Você está abaixo do peso!", calcular_IMC);
			System.out.print(h_resultado);
		}

		if ((calcular_IMC > h_imc[0]) && (calcular_IMC < h_imc[1]))
		{
			System.out.print("\n\n Resultado IMC (Masculino):");
			System.out.printf("\n- O seu IMC é: %6.1f. Você está no peso ideal!", calcular_IMC);
			System.out.print(h_resultado);
		}

		if (calcular_IMC > h_imc[1])
		{
			System.out.print("\n\n Resultado IMC (Masculino):");
			System.out.printf("\n- O seu IMC é: %6.1f. Você está acima do peso!", calcular_IMC);
			System.out.print(h_resultado);
		}
	}

	if (sexo == 2)
	{
		if (calcular_IMC < m_imc[0])
		{
			System.out.print("\n\n Resultado IMC (Feminino):");
			System.out.printf("\n- O seu IMC é: %6.1f. Você está abaixo do peso!", calcular_IMC);
			System.out.print(m_resultado);
		}

		if ((calcular_IMC > m_imc[0]) && (calcular_IMC < m_imc[1]))	
		{	
			System.out.print("\n\n Resultado IMC (Feminino):");	
			System.out.printf("\n- O seu IMC é: %6.1f. Você está no peso ideal!", calcular_IMC);
			System.out.print(m_resultado);
		}

		if (calcular_IMC > m_imc[1])
		{
			System.out.print("\n\n Resultado IMC (Feminino):");
			System.out.printf("\n- O seu IMC é: %6.1f. Você está acima do peso!", calcular_IMC);
			System.out.print(m_resultado);
		}
	}	
    }
