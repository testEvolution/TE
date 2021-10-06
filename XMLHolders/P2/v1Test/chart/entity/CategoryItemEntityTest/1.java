@Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        d.addValue(1.0, "R1", "C1");
        d.addValue(2.0, "R1", "C2");
        d.addValue(3.0, "R2", "C1");
        d.addValue(4.0, "R2", "C2");
        CategoryItemEntity e1 = new CategoryItemEntity(new Rectangle2D.Double(
                1.0, 2.0, 3.0, 4.0), "ToolTip", "URL", d, "R2", "C2");
        CategoryItemEntity e2 = (CategoryItemEntity) e1.clone();
        assertTrue(e1 != e2);
        assertTrue(e1.getClass() == e2.getClass());
        assertTrue(e1.equals(e2));
    }

    