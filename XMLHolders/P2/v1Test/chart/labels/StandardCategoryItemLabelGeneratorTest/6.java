@Test
    public void testEquals1481087() {
        StandardCategoryItemLabelGenerator g1
                = new StandardCategoryItemLabelGenerator("{0}",
                new DecimalFormat("0.00"));
        StandardCategoryToolTipGenerator g2
                = new StandardCategoryToolTipGenerator("{0}",
                new DecimalFormat("0.00"));
        assertFalse(g1.equals(g2));
    }

}