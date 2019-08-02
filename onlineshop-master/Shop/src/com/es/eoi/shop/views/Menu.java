package com.es.eoi.shop.views;

import java.util.Scanner;

import com.es.eoi.shop.Main;
import com.es.eoi.shop.entities.Article;
import com.es.eoi.shop.entities.Textile;
import com.es.eoi.shop.managers.ArticleManager;
import com.es.eoi.shop.utils.ArticleFactory;

public class Menu {

	static Scanner scan = new Scanner(System.in);

	public static void printMainMenu() {
		boolean repeat = true;

		do {
			System.out.println("BIENVENIDO A MI TIENDA, INTRODUZCA UNA OPCION");
			System.out.println("1-COMPRAR ARTICULOS");
			System.out.println("2-LISTAR ARTICULOS");
			System.out.println("3-GESTIONAR ARTICULOS");
			System.out.println();
			@SuppressWarnings("resource")

			int option = scan.nextInt();
			System.out.println();
			System.out.println("Has elegido la opcion: " + option);

			switch (option) {
			case 1:
				/* metodo compra */
				repeat = false;
				break;

			case 2:
				/* metodo listar */
				repeat = false;
				break;
			case 3:
				gestMenu();
				repeat = false;
				break;

			default:
				System.out.println("Opción no valida");
				break;
			}

		} while (repeat);

	}

	private static void gestMenu() {
		boolean repeat = true;

		do {
			System.out.println("GESTIONAR ARTICULOS");
			System.out.println("1-AÑADIR ARTICULOS");
			System.out.println("2-ACTUALIZAR ARTICULOS");
			System.out.println("3-LISTAR ARTICULOS");
			System.out.println("4-BORRAR ARTICULOS");

			System.out.println();
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);

			int option = scan.nextInt();
			System.out.println();
			System.out.println("Has elegido la opcion: " + option);

			switch (option) {
			case 1:
				addArticle();
				repeat = false;
				break;

			case 2:
				updaArticle();
				repeat = false;
				break;
			case 3:
				listArticle();
				repeat = false;
				break;
			case 4:
				delArticle();
				repeat = false;
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}

		} while (repeat);

	}

	private static void delArticle() {
		// TODO Auto-generated method stub

	}

	private static void listArticle() {
		// TODO Auto-generated method stub

	}

	private static void updaArticle() {
		// TODO Auto-generated method stub

	}

	private static void addArticle() {

		String name;
		String description;
		Double price;
		String provider;
		Integer stock;
		String categoria;
		String color;
		String size;

		scan = new Scanner(System.in);

		System.out.println("Introduzca  el  nombre del articulo: ");
		name = scan.nextLine();

		System.out.println("Introduzca  la  descripción del articulo: ");
		description = scan.nextLine();

		System.out.println("Introduzca  el  proveedor del articulo: ");
		provider = scan.nextLine();

		System.out.println("Introduzca  la  categoria del articulo: ");
		categoria = scan.nextLine();

		System.out.println("Introduzca  el  stock del articulo: ");
		stock = scan.nextInt();

		System.out.println("Introduzca  el  precio: ");
		price = scan.nextDouble();

		Article article = ArticleFactory.getArticle(categoria);

		article.setCategory(categoria);
		article.setVat(article.getVat());
		article.setDescription(description);
		article.setName(name);
		article.setPrice(price);
		article.setProvider(provider);
		article.setStock(stock);
		

		if(article instanceof Textile) {
			
			scan = new Scanner(System.in);
			
			System.out.println("Introduzca  el  color del articulo: ");
			color = scan.nextLine();
			System.out.println("Introduzca  la  talla del articulo: ");
			size = scan.nextLine();
			
			((Textile)article).setSize(size);

			((Textile)article).setColor(color);
		}

		System.out.println(article.toString());
		Main.articleManager.save(article);

	}

}
