package net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartList {
    ArrayList<Part> partList = new ArrayList<>();



    public PartList() {
    }

    public static void main(String[] args) {
    }


    public Part returnPart(String partName) {
        //TODO Remove this once incorporated into the registry
        switch (partName) {
//            case "knees" -> {
//                return new Part("knees", new ArrayList<Block>(
//                        Arrays.asList(new Block(2, 2, 2))
//                )
//                );
//            }
//            case "neck_lean_arched_short_1" -> {
//                return new Part("neck_lean_arched_short_1", new ArrayList<Block>(
//                        Arrays.asList(new Block(4, 7, 4),
//                                new Block(4, 6, 4),
//                                new Block(4, 7, 2),
//                                new Block(4, 4, 4),
//                                new Block(4, 4, 4))
//                )
//                );
//            }
//            case "neck_lean_arched_short_2" -> {
//                return new Part("neck_lean_arched_short_2", new ArrayList<Block>(
//                        Arrays.asList(new Block(4, 8, 4),
//                                new Block(4, 7, 4),
//                                new Block(4, 8, 2),
//                                new Block(4, 5, 4),
//                                new Block(4, 4, 4))
//                )
//                );
//            } //Todo Finish the rest of the necks
//
//
//
//
//            //EWED
//            case "neck_lean_ewed_short_1" -> {
//                return new Part("neck_lean_ewed_short_1", new ArrayList<Block>(
//                        Arrays.asList(new Block(4, 7, 4)
//                                , new Block(3, 7, 4)
//                                , new Block( 3, 4, 4),
//                                new Block( 4, 6, 2))
//                )
//                );
//            }
//            case "neck_lean_ewed_short_2" -> {
//                return new Part("neck_lean_ewed_short_2", new ArrayList<Block>(
//                        Arrays.asList(new Block( 4, 8, 4)
//                                , new Block( 3, 8, 4)
//                                , new Block( 3, 4, 4),
//                                new Block( 4, 7, 2))
//                )
//                );
//            }
//            case "neck_lean_ewed_average_1" -> {
//                return new Part("neck_lean_ewed_average_1", new ArrayList<Block>(
//                        Arrays.asList(new Block(100, 100, 4, 9, 4)
//                                , new Block(150, 150, 3, 9, 4)
//                                , new Block( 200, 200, 3, 4, 4),
//                                new Block( 50, 50, 4, 8, 2))
//                )
//                );
//            }
//            case "neck_lean_ewed_average_2" -> {
//                return new Part("neck_lean_ewed_average_2", new ArrayList<Block>(
//                        Arrays.asList(new Block( 4, 10, 4)
//                                , new Block( 3, 10, 4)
//                                , new Block( 3, 4, 4),
//                                new Block( 4, 9, 2))
//                )
//                );
//            }
//            case "neck_lean_ewed_long_1" -> {
//                return new Part("neck_lean_ewed_long_1", new ArrayList<Block>(
//                        Arrays.asList(new Block( 4, 11, 4)
//                                , new Block( 3, 11, 4)
//                                , new Block( 3, 4, 4),
//                                new Block( 4, 10, 2))
//                )
//                );
//            }
//            case "neck_lean_ewed_long_2" -> {
//                return new Part("neck_lean_ewed_long_2", new ArrayList<Block>(
//                        Arrays.asList(
//                                new Block( 4, 12, 4),
//                                new Block( 3, 12, 4),
//                                new Block(3, 4, 4),
//                                new Block( 4, 11, 2))
//                )
//                );
//            }
//
//
//            //Ewed Average
//            case "neck_average_ewed_short_1" -> {
//                return new Part("neck_average_ewed_short_1", new ArrayList<Block>(
//                        Arrays.asList(new Block( 5, 7, 4)
//                                , new Block( 4, 7, 4)
//                                , new Block(4, 4, 4),
//                                new Block(4, 6, 2))
//                )
//                );
//            }
//            case "neck_average_ewed_short_2" -> {
//                return new Part("neck_average_ewed_short_2", new ArrayList<Block>(
//                        Arrays.asList(new Block( 5, 8, 4)
//                                , new Block( 4, 8, 4)
//                                , new Block(4, 4, 4),
//                                new Block( 4, 7, 2))
//                )
//                );
//            }
//            case "neck_average_ewed_average_1" -> {
//                return new Part("neck_average_ewed_average_1", new ArrayList<Block>(
//                        Arrays.asList(new Block( 100, 100, 5, 9, 4)
//                                , new Block( 150, 150,4, 9, 4)
//                                , new Block(4, 4, 4),
//                                new Block( 4, 8, 2))
//                )
//                );
//            }
//            case "neck_average_ewed_average_2" -> {
//                return new Part("neck_average_ewed_average_2", new ArrayList<Block>(
//                        Arrays.asList(new Block( 5, 10, 4)
//                                , new Block( 4, 10, 4)
//                                , new Block( 4, 4, 4),
//                                new Block( 4, 9, 2))
//                )
//                );
//            }
//            case "neck_average_ewed_long_1" -> {
//                return new Part("neck_average_ewed_long_1", new ArrayList<Block>(
//                        Arrays.asList(new Block( 5, 11, 4)
//                                , new Block(4, 11, 4)
//                                , new Block(4, 4, 4),
//                                new Block(4, 10, 2))
//                )
//                );
//            }
//            case "neck_average_ewed_long_2" ->{
//                return new Part("neck_average_ewed_long_2", new ArrayList<Block>(
//                        Arrays.asList(
//                                new Block( 5, 12, 4),
//                                new Block( 4, 12, 4),
//                                new Block( 4, 4, 4),
//                                new Block( 4, 11, 2))
//                )
//                );
//            }
//
//
//            //Ewed Muscular
//            case "neck_muscular_ewed_short_1" -> {
//                return new Part("neck_muscular_ewed_short_1", new ArrayList<Block>(
//                        Arrays.asList(new Block( 6, 7, 4)
//                                , new Block( 5, 7, 4)
//                                , new Block(5, 4, 4),
//                                new Block( 5, 6, 2))
//                )
//                );
//            }
//            case "neck_muscular_ewed_short_2" -> {
//                return new Part("neck_muscular_ewed_short_2", new ArrayList<Block>(
//                        Arrays.asList(new Block(6, 8, 4)
//                                , new Block(5, 8, 4)
//                                , new Block( 5, 4, 4),
//                                new Block( 5, 7, 2))
//                )
//                );
//            }
//            case "neck_muscular_ewed_average_1" -> {
//                return new Part("neck_muscular_ewed_average_1", new ArrayList<Block>(
//                        Arrays.asList(new Block( 6, 9, 4)
//                                , new Block( 5, 9, 4)
//                                , new Block( 5, 4, 4),
//                                new Block( 5, 8, 2))
//                )
//                );
//            }
//            case "neck_muscular_ewed_average_2" -> {
//                return new Part("neck_muscular_ewed_average_2", new ArrayList<Block>(
//                        Arrays.asList(new Block( 6, 10, 4)
//                                , new Block( 5, 10, 4)
//                                , new Block( 5, 4, 4),
//                                new Block( 5, 9, 2))
//                )
//                );
//            }
//            case "neck_muscular_ewed_long_1" -> {
//                return new Part("neck_muscular_ewed_long_1", new ArrayList<Block>(
//                        Arrays.asList(new Block( 6, 11, 4)
//                                , new Block(5, 11, 4)
//                                , new Block(5, 4, 4),
//                                new Block( 5, 10, 2))
//                )
//                );
//            }
//            case "neck_muscular_ewed_long_2" -> {
//                return new Part("neck_muscular_ewed_long_2", new ArrayList<Block>(
//                        Arrays.asList(
//                                new Block( 6, 12, 4),
//                                new Block( 5, 12, 4),
//                                new Block(5, 4, 4),
//                                new Block( 5, 11, 2))
//                )
//                );
//            }
//
//
//            /* MANE */
//            //ARCHED
//            case "mane_top_arched" -> {
//                return new Part("mane_top_arched", new ArrayList<Block>(
//                        Arrays.asList(new Block(1470, 1524, 1, 7, 5),
//                                new Block(1494, 1524, 1, 7, 5))
//                )
//                );
//            }
//            case "mane_flow_arched_short_1" -> {
//                return new Part("mane_flow_arched_short_1", new ArrayList<Block>(
//                        Arrays.asList(new Block(1426, 1574, 1, 7, 7),
//                                new Block(1474, 1574, 1, 7, 7))
//                )
//                );
//            }
//            case "mane_flow_arched_short_2" -> {
//                return new Part("mane_flow_arched_short_2", new ArrayList<Block>(
//                        Arrays.asList(new Block(1518, 1574, 1, 7, 8),
//                                new Block(1572, 1576, 1, 7, 8))
//                )
//                );
//            }
//            case "mane_flow_arched_average_1" -> {
//                return new Part("mane_flow_arched_average_1", new ArrayList<Block>(
//                        Arrays.asList(new Block(1620, 1572, 1, 7, 9),
//                                new Block(1676, 1572, 1, 7, 9))
//                )
//                );
//            }
//            case "mane_flow_arched_average_2" -> {
//                return new Part("mane_flow_arched_average_2", new ArrayList<Block>(
//                        Arrays.asList(new Block(1722, 1568, 1, 7, 10),
//                                new Block(1784, 1566, 1, 7, 10))
//                )
//                );
//            }
//            case "mane_flow_arched_long_1" -> {
//                return new Part("mane_flow_arched_long_1", new ArrayList<Block>(
//                        Arrays.asList(new Block(1840, 1566, 1, 7, 12),
//                                new Block(1906, 1564, 1, 7, 12))
//                )
//                );
//            }
//            case "mane_flow_arched_long_2" -> {
//                return new Part("mane_flow_arched_long_2", new ArrayList<Block>(
//                        Arrays.asList(new Block(1918, 1616, 1, 7, 13),
//                                new Block(1946, 1542, 1, 7, 13))
//                )
//                );
//            }
//
//            //EWED
//            case "mane_top_ewed" -> {
//                return new Part("mane_top_ewed", new ArrayList<Block>(
//                        Arrays.asList(new Block(1458, 1666, 1, 7, 4),
//                                new Block(1478, 1666, 1, 7, 4))
//                )
//                );
//            }
//            case "mane_flow_ewed_short_1" -> {
//                return new Part("mane_flow_ewed_short_1", new ArrayList<Block>(
//                        Arrays.asList(new Block(1432, 1700, 1, 7, 7),
//                                new Block(1478, 1702, 1, 7, 7))
//                )
//                );
//            }
//            case "mane_flow_ewed_short_2" -> {
//                return new Part("mane_flow_ewed_short_2", new ArrayList<Block>(
//                        Arrays.asList(new Block(1526, 1700, 1, 7, 8),
//                                new Block(1574, 1700, 1, 7, 8))
//                )
//                );
//            }
//            case "mane_flow_ewed_average_1" -> {
//                return new Part("mane_flow_ewed_average_1", new ArrayList<Block>(
//                        Arrays.asList(new Block(1620, 1698, 1, 7, 9),
//                                new Block(1672, 1698, 1, 7, 9))
//                )
//                );
//            }
//            case "mane_flow_ewed_average_2" -> {
//                return new Part("mane_flow_ewed_average_2", new ArrayList<Block>(
//                        Arrays.asList(new Block(1722, 1694, 1, 7, 10),
//                                new Block(1778, 1694, 1, 7, 10))
//                )
//                );
//            }
//            case "mane_flow_ewed_long_1" -> {
//                return new Part("mane_flow_ewed_long_1", new ArrayList<Block>(
//                        Arrays.asList(new Block(1836, 1692, 1, 7, 11),
//                                new Block(1896, 1692, 1, 7, 11))
//                )
//                );
//            }
//            case "mane_flow_ewed_long_2" -> {
//                return new Part("mane_flow_ewed_long_2", new ArrayList<Block>(
//                        Arrays.asList(new Block(1926, 1766, 1, 7, 12),
//                                new Block(1926, 1726, 1, 7, 12))
//                )
//                );
//            }
//
//            // STRAIGHT
//            case "mane_top_straight" -> {
//                return new Part("mane_top_straight", new ArrayList<Block>(
//                        Arrays.asList(new Block(1476, 1798, 1, 7, 5),
//                                new Block(1500, 1798, 1, 7, 5))
//                )
//                );
//            }
//            case "mane_flow_straight_short_1" -> {
//                return new Part("mane_flow_straight_short_1", new ArrayList<Block>(
//                        Arrays.asList(new Block(1420, 1828, 1, 7, 6),
//                                new Block(1470, 1834, 1, 7, 6))
//                )
//                );
//            }
//            case "mane_flow_straight_short_2" -> {
//                return new Part("mane_flow_straight_short_2", new ArrayList<Block>(
//                        Arrays.asList(new Block(1530, 1824, 1, 7, 7),
//                                new Block(1578, 1824, 1, 7, 7))
//                )
//                );
//            }
//            case "mane_flow_straight_average_1" -> {
//                return new Part("mane_flow_straight_average_1", new ArrayList<Block>(
//                        Arrays.asList(new Block(1626, 1822, 1, 7, 8),
//                                new Block(1680, 1822, 1, 7, 8))
//                )
//                );
//            }
//            case "mane_flow_straight_average_2" -> {
//                return new Part("mane_flow_straight_average_2", new ArrayList<Block>(
//                        Arrays.asList(new Block(1730, 1822, 1, 7, 9),
//                                new Block(1784, 1822, 1, 7, 9))
//                )
//                );
//            }
//            case "mane_flow_straight_long_1" -> {
//                return new Part("mane_flow_straight_long_1", new ArrayList<Block>(
//                        Arrays.asList(new Block(1836, 1820, 1, 7, 10),
//                                new Block(1894, 1820, 1, 7, 10))
//                )
//                );
//            }
//            case "mane_flow_straight_long_2" -> {
//                return new Part("mane_flow_straight_long_2", new ArrayList<Block>(
//                        Arrays.asList(new Block(1936, 1872, 1, 7, 11),
//                                new Block(1950, 1816, 1, 7, 11))
//                )
//                );
//            }
//
//            // SWAN
//            case "mane_top_swan" -> {
//                return new Part("mane_top_swan", new ArrayList<Block>(
//                        Arrays.asList(new Block(1458, 1924, 1, 7, 6),
//                                new Block(1486, 1924, 1, 7, 6))
//                )
//                );
//            }
//            case "mane_flow_swan_short_1" -> {
//                return new Part("mane_flow_swan_short_1", new ArrayList<Block>(
//                        Arrays.asList(new Block(1420, 1948, 1, 7, 7),
//                                new Block(1474, 1956, 1, 7, 7))
//                )
//                );
//            }
//            case "mane_flow_swan_short_2" -> {
//                return new Part("mane_flow_swan_short_2", new ArrayList<Block>(
//                        Arrays.asList(new Block(1526, 1948, 1, 7, 8),
//                                new Block(1566, 1944, 1, 7, 8))
//                )
//                );
//            }
//            case "mane_flow_swan_average_1" -> {
//                return new Part("mane_flow_swan_average_1", new ArrayList<Block>(
//                        Arrays.asList(new Block(1630, 1950, 1, 7, 9),
//                                new Block(1684, 1956, 1, 7, 9))
//                )
//                );
//            }
//            case "mane_flow_swan_average_2" -> {
//                return new Part("mane_flow_swan_average_2", new ArrayList<Block>(
//                        Arrays.asList(new Block(1730, 1944, 1, 7, 10),
//                                new Block(1790, 1948, 1, 7, 10))
//                )
//                );
//            }
//            case "mane_flow_swan_long_1" -> {
//                return new Part("mane_flow_swan_long_1", new ArrayList<Block>(
//                        Arrays.asList(new Block(1836, 1942, 1, 7, 11),
//                                new Block(1896, 1946, 1, 7, 11))
//                )
//                );
//            }
//            case "mane_flow_swan_long_2" -> {
//                return new Part("mane_flow_swan_long_2", new ArrayList<Block>(
//                        Arrays.asList(new Block(1920, 1990, 1, 7, 12),
//                                new Block(1930, 1930, 1, 7, 12))
//                )
//                );
//            }


            //HEADS

            case "head_straight_lean" -> {
                return new Part("head_straight_lean", new ArrayList<Block>(
                        Arrays.asList(
                                new Block(4, 3, 4),
                                new Block(3, 6, 3),
                                new Block(3, 6, 3),
                                new Block(4, 4, 3),
                                new Block(3, 3, 3),
                                new Block(3, 1, 3),
                                new Block(1, 3, 3))
                )
                );
            }
            case "head_straight_average" -> {
                return new Part("head_straight_average", new ArrayList<Block>(
                        Arrays.asList(
                                new Block(5, 3, 4),
                                new Block(4, 6, 3),
                                new Block(4, 6, 3),
                                new Block(5, 4, 3),
                                new Block(3, 3, 3),
                                new Block(3, 1, 3),
                                new Block(1, 3, 3))
                )
                );
            }
            case "head_straight_muscular" -> {
                return new Part("head_straight_muscular", new ArrayList<Block>(
                        Arrays.asList(
                                new Block(6, 3, 4),
                                new Block(4, 6, 3),
                                new Block(4, 6, 3),
                                new Block(6, 4, 3),
                                new Block(3, 3, 3),
                                new Block(3, 1, 3),
                                new Block(1, 3, 3))
                )
                );
            }

            case "head_stocky_lean" -> {
                return new Part("head_stocky_lean", new ArrayList<Block>(
                        Arrays.asList(
                                new Block(4, 3, 5),
                                new Block(3, 7, 3),
                                new Block(3, 4, 3),
                                new Block(4, 4, 4),
                                new Block(3, 3, 3),
                                new Block(3, 1, 3),
                                new Block(1, 3, 3))
                )
                );
            }
            case "head_stocky_average" -> {
                return new Part("head_stocky_average", new ArrayList<Block>(
                        Arrays.asList(
                                new Block(5, 3, 5),
                                new Block(4, 7, 3),
                                new Block(4, 4, 3),
                                new Block(5, 4, 4),
                                new Block(3, 3, 3),
                                new Block(3, 1, 3),
                                new Block(1, 3, 3))
                )
                );
            }
            case "head_stocky_muscular" -> {
                return new Part("head_stocky_muscular", new ArrayList<Block>(
                        Arrays.asList(
                                new Block(6, 3, 5),
                                new Block(4, 7, 3),
                                new Block(4, 4, 3),
                                new Block(6, 4, 4),
                                new Block(3, 3, 3),
                                new Block(3, 1, 3),
                                new Block(1, 3, 3))
                )
                );
            }
            case "head_roman_lean" -> {
                return new Part("head_roman_lean", new ArrayList<Block>(
                        Arrays.asList(
                                new Block(4, 3, 5),
                                new Block(3, 6, 3),
                                new Block(3, 5, 3),
                                new Block(4, 4, 3),
                                new Block(3, 3, 3),
                                new Block(3, 1, 3),
                                new Block(1, 4, 2))
                )
                );
            }
            case "head_roman_average" -> {
                return new Part("head_roman_average", new ArrayList<Block>(
                        Arrays.asList(
                                new Block(5, 3, 5),
                                new Block(3, 6, 3),
                                new Block(3, 5, 3),
                                new Block(5, 4, 3),
                                new Block(3, 3, 3),
                                new Block(3, 1, 3),
                                new Block(1, 4, 3))
                )
                );
            }
            case "head_roman_muscular" -> {
                return new Part("head_roman_muscular", new ArrayList<Block>(
                        Arrays.asList(
                                new Block(6, 3, 5),
                                new Block(4, 6, 3),
                                new Block(4, 5, 3),
                                new Block(6, 4, 3),
                                new Block(4, 3, 3),
                                new Block(4, 1, 3),
                                new Block(1, 4, 3))
                )
                );
            }

            case "head_dished_lean" -> {
                return new Part("head_dished_lean", new ArrayList<Block>(
                        Arrays.asList(
                                new Block(4, 3, 5),
                                new Block(3, 5, 2),
                                new Block(3, 5, 3),
                                new Block(4, 4, 3),
                                new Block(3, 2, 2),
                                new Block(3, 1, 2),
                                new Block(2, 3, 1))
                )
                );
            }
            case "head_dished_average" -> {
                return new Part("head_dished_average", new ArrayList<Block>(
                        Arrays.asList(
                                new Block(5, 3, 5),
                                new Block(3, 5, 2),
                                new Block(3, 5, 3),
                                new Block(5, 4, 3),
                                new Block(3, 2, 2),
                                new Block(3, 1, 2),
                                new Block(3, 3, 1))
                )
                );
            }
            case "head_dished_muscular" -> {
                return new Part("head_dished_muscular", new ArrayList<Block>(
                        Arrays.asList(
                                new Block(6, 3, 5),
                                new Block(4, 5, 2),
                                new Block(4, 5, 3),
                                new Block(6, 4, 3),
                                new Block(4, 2, 2),
                                new Block(4, 1, 2),
                                new Block(3, 3, 1))
                )
                );
            }

            // BACKS


            default -> {
                return new Part("NULL", null);
            }
        }
    }

    public ArrayList<Part> returnPartList(String partType) {
        partType = partType.toLowerCase();
        ArrayList<Part> partList2 = new ArrayList<>();
        switch(partType) {
            case "neck" -> {
                partList2.add(returnPart("neck_lean_ewed_short_1"));
                partList2.add(returnPart("neck_lean_ewed_short_2"));
                partList2.add(returnPart("neck_lean_ewed_average_1"));
                partList2.add(returnPart("neck_lean_ewed_average_2"));
                partList2.add(returnPart("neck_lean_ewed_long_1"));
                partList2.add(returnPart("neck_lean_ewed_long_2"));

                partList2.add(returnPart("neck_average_ewed_short_1"));
                partList2.add(returnPart("neck_average_ewed_short_2"));
                partList2.add(returnPart("neck_average_ewed_average_1"));
                partList2.add(returnPart("neck_average_ewed_average_2"));
                partList2.add(returnPart("neck_average_ewed_long_1"));
                partList2.add(returnPart("neck_average_ewed_long_2"));

                partList2.add(returnPart("neck_muscular_ewed_short_1"));
                partList2.add(returnPart("neck_muscular_ewed_short_2"));
                partList2.add(returnPart("neck_muscular_ewed_average_1"));
                partList2.add(returnPart("neck_muscular_ewed_average_2"));
                partList2.add(returnPart("neck_muscular_ewed_long_1"));
                partList2.add(returnPart("neck_muscular_ewed_long_2"));
            }
            case "arched_mane" -> {
                partList2.add(returnPart("mane_flow_arched_short_1"));
                partList2.add(returnPart("mane_flow_arched_short_2"));
                partList2.add(returnPart("mane_flow_arched_average_1"));
                partList2.add(returnPart("mane_flow_arched_average_2"));
                partList2.add(returnPart("mane_flow_arched_long_1"));
                partList2.add(returnPart("mane_flow_arched_long_2"));
            }
            case "ewed_mane" -> {
                partList2.add(returnPart("mane_flow_ewed_short_1"));
                partList2.add(returnPart("mane_flow_ewed_short_2"));
                partList2.add(returnPart("mane_flow_ewed_average_1"));
                partList2.add(returnPart("mane_flow_ewed_average_2"));
                partList2.add(returnPart("mane_flow_ewed_long_1"));
                partList2.add(returnPart("mane_flow_ewed_long_2"));
            }
            case "straight_mane" -> {
                partList2.add(returnPart("mane_flow_straight_short_1"));
                partList2.add(returnPart("mane_flow_straight_short_2"));
                partList2.add(returnPart("mane_flow_straight_average_1"));
                partList2.add(returnPart("mane_flow_straight_average_2"));
                partList2.add(returnPart("mane_flow_straight_long_1"));
                partList2.add(returnPart("mane_flow_straight_long_2"));
            }
            case "swan_mane" -> {
                partList2.add(returnPart("mane_flow_swan_short_1"));
                partList2.add(returnPart("mane_flow_swan_short_2"));
                partList2.add(returnPart("mane_flow_swan_average_1"));
                partList2.add(returnPart("mane_flow_swan_average_2"));
                partList2.add(returnPart("mane_flow_swan_long_1"));
                partList2.add(returnPart("mane_flow_swan_long_2"));
            }
            case "mane_top" -> {
                partList2.add(returnPart("mane_top_swan"));
                partList2.add(returnPart("mane_top_ewed"));
                partList2.add(returnPart("mane_top_straight"));

            }
            case "arched_mane_top" -> {
                partList2.add(returnPart("mane_top_arched"));
            }
            case "head_straight" -> {
                partList2.add(returnPart("head_straight_lean"));
                partList2.add(returnPart("head_straight_average"));
                partList2.add(returnPart("head_straight_muscular"));
            }
            case "head_stocky" -> {
                partList2.add(returnPart("head_stocky_lean"));
                partList2.add(returnPart("head_stocky_average"));
                partList2.add(returnPart("head_stocky_muscular"));
            }
            case "head_roman" -> {
                partList2.add(returnPart("head_roman_lean"));
                partList2.add(returnPart("head_roman_average"));
                partList2.add(returnPart("head_roman_muscular"));
            }
            case "head_dished" -> {
                partList2.add(returnPart("head_dished_lean"));
                partList2.add(returnPart("head_dished_average"));
                partList2.add(returnPart("head_dished_muscular"));
            }
            case "knees" -> {
                partList2.add(returnPart("knees"));
            }
            default -> {
                return new ArrayList<Part>();
            }
        }
        return partList2;
    }

    public ArrayList<Part> createPartList(List<String> partTypeNames) {
        ArrayList<Part> partList = new ArrayList<>();
        PartList Parts = new PartList();

        for (String s: partTypeNames) {
            ArrayList<Part> partList2 = Parts.returnPartList(s);
            partList.addAll(partList2);
            System.out.println("ADDED " + s);
        }
        return partList;
    }
}