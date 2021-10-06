@Test
    public void testEquals() {
        CategoryAxis a1 = new CategoryAxis("Test");
        CategoryAxis a2 = new CategoryAxis("Test");
        assertTrue(a1.equals(a2));

        // lowerMargin
        a1.setLowerMargin(0.15);
        assertFalse(a1.equals(a2));
        a2.setLowerMargin(0.15);
        assertTrue(a1.equals(a2));

        // upperMargin
        a1.setUpperMargin(0.15);
        assertFalse(a1.equals(a2));
        a2.setUpperMargin(0.15);
        assertTrue(a1.equals(a2));

        // categoryMargin
        a1.setCategoryMargin(0.15);
        assertFalse(a1.equals(a2));
        a2.setCategoryMargin(0.15);
        assertTrue(a1.equals(a2));

        // maxCategoryLabelWidthRatio
        a1.setMaximumCategoryLabelWidthRatio(0.98f);
        assertFalse(a1.equals(a2));
        a2.setMaximumCategoryLabelWidthRatio(0.98f);
        assertTrue(a1.equals(a2));

        // categoryLabelPositionOffset
        a1.setCategoryLabelPositionOffset(11);
        assertFalse(a1.equals(a2));
        a2.setCategoryLabelPositionOffset(11);
        assertTrue(a1.equals(a2));

        // categoryLabelPositions
        a1.setCategoryLabelPositions(CategoryLabelPositions.DOWN_45);
        assertFalse(a1.equals(a2));
        a2.setCategoryLabelPositions(CategoryLabelPositions.DOWN_45);
        assertTrue(a1.equals(a2));

        // categoryLabelToolTips
        a1.addCategoryLabelToolTip("Test", "Check");
        assertFalse(a1.equals(a2));
        a2.addCategoryLabelToolTip("Test", "Check");
        assertTrue(a1.equals(a2));

        // categoryLabelURLs
        a1.addCategoryLabelURL("Test", "http://www.jfree.org/");
        assertFalse(a1.equals(a2));
        a2.addCategoryLabelURL("Test", "http://www.jfree.org/");
        assertTrue(a1.equals(a2));

        // tickLabelFont
        a1.setTickLabelFont("C1", new Font("Dialog", Font.PLAIN, 21));
        assertFalse(a1.equals(a2));
        a2.setTickLabelFont("C1", new Font("Dialog", Font.PLAIN, 21));
        assertTrue(a1.equals(a2));

        // tickLabelPaint
        a1.setTickLabelPaint("C1", Color.RED);
        assertFalse(a1.equals(a2));
        a2.setTickLabelPaint("C1", Color.RED);
        assertTrue(a1.equals(a2));

        // tickLabelPaint2
        a1.setTickLabelPaint("C1", new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW));
        assertFalse(a1.equals(a2));
        a2.setTickLabelPaint("C1", new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW));
        assertTrue(a1.equals(a2));

    }

    