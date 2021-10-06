@Test
    public void testEquals() {
        SubCategoryAxis a1 = new SubCategoryAxis("Test");
        SubCategoryAxis a2 = new SubCategoryAxis("Test");
        assertTrue(a1.equals(a2));
        assertTrue(a2.equals(a1));

        // subcategories
        a1.addSubCategory("Sub 1");
        assertFalse(a1.equals(a2));
        a2.addSubCategory("Sub 1");
        assertTrue(a1.equals(a2));

        // subLabelFont
        a1.setSubLabelFont(new Font("Serif", Font.BOLD, 15));
        assertFalse(a1.equals(a2));
        a2.setSubLabelFont(new Font("Serif", Font.BOLD, 15));
        assertTrue(a1.equals(a2));

        // subLabelPaint
        a1.setSubLabelPaint(Color.RED);
        assertFalse(a1.equals(a2));
        a2.setSubLabelPaint(Color.RED);
        assertTrue(a1.equals(a2));
    }

    