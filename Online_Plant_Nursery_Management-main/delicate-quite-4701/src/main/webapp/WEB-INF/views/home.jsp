<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Plantify Nursery 🌱</title>
    <style>
        /* Reset */
        * { margin: 0; padding: 0; box-sizing: border-box; }

        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: #eaf4ea; /* light green background */
            color: #333;
            line-height: 1.6;
        }

        header {
            background: linear-gradient(135deg, #1b5e20, #4caf50); /* dark to medium green */
            color: white;
            padding: 30px 20px;
            text-align: center;
            box-shadow: 0px 4px 6px rgba(0,0,0,0.1);
        }

        header h1 { font-size: 2.2em; margin-bottom: 5px; }
        header p { font-size: 1.1em; font-weight: 400; }

        /* Navigation Bar */
        nav {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
            gap: 12px;
            padding: 15px 0;
            background: linear-gradient(135deg, #43a047, #81c784); /* medium green gradient */
            box-shadow: 0 4px 8px rgba(0,0,0,0.2);
            border-radius: 12px;
            margin: 20px;
        }

        .nav-item {
            padding: 10px 20px;
            border-radius: 25px;
            background-color: rgba(255,255,255,0.15);
            color: white;
            font-weight: 600;
            text-decoration: none;
            transition: all 0.3s ease;
            box-shadow: 0 2px 5px rgba(0,0,0,0.2);
        }

        .nav-item:hover {
            background-color: #c8e6c9; /* light green on hover */
            color: #1b5e20; /* dark green text */
            transform: translateY(-3px);
            box-shadow: 0 6px 12px rgba(0,0,0,0.3);
        }

        .logout-link {
            background-color: #388e3c;
        }

        .logout-link:hover {
            background-color: #1b5e20;
            color: white;
        }

        /* Main Section */
        section {
            max-width: 1200px;
            margin: 30px auto;
            padding: 0 20px;
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
            gap: 20px;
        }

        .category {
            background: linear-gradient(145deg, #ffffff, #dcedc8); /* subtle green gradient card */
            padding: 20px;
            border-radius: 12px;
            box-shadow: 0px 4px 8px rgba(0,0,0,0.08);
            transition: transform 0.3s, box-shadow 0.3s;
        }

        .category:hover {
            transform: translateY(-5px);
            box-shadow: 0px 8px 15px rgba(0,0,0,0.15);
        }

        .category h2 {
            color: #2e7d32; /* medium-dark green */
            margin-bottom: 15px;
            font-size: 1.5em;
        }

        .category ul { list-style: none; }

        .category li {
            margin: 10px 0;
            padding-left: 15px;
            position: relative;
            transition: all 0.2s ease;
        }

        .category li::before {
            content: "•";
            color: #4caf50; /* medium green bullet */
            position: absolute;
            left: 0;
            font-size: 1.2em;
        }

        .category li:hover {
            background-color: #c5e1a5; /* light green highlight on hover */
            transform: translateX(5px);
            font-weight: 600;
        }

        footer {
            background-color: #1b5e20; /* deep green */
            color: white;
            text-align: center;
            padding: 20px;
            margin-top: 40px;
        }

        footer p { margin: 5px 0; }

        /* Responsive adjustments */
        @media (max-width: 768px) {
            nav {
                flex-direction: column;
                align-items: center;
            }

            .nav-item { width: 80%; text-align: center; }

            section { grid-template-columns: 1fr; }
        }
    </style>
</head>
<body>

<header>
    <h1>🌱 Plantify Nursery</h1>
    <p>Everything you need for your garden – from seeds to tools!</p>
</header>

<nav>
    <a href="plants" class="nav-item">Plants</a>
    <a href="planters" class="nav-item">Planters</a>
    <a href="seeds" class="nav-item">Seeds</a>
    <a href="orders" class="nav-item">Orders</a>
    <a href="customers" class="nav-item">Customers</a>
    <a href="#cutting" class="nav-item">Cutting Tools</a>
    <a href="#watering" class="nav-item">Watering</a>
    <a href="#fertilisers" class="nav-item">Fertilisers</a>
    <a href="#accessories" class="nav-item">Accessories</a>

    <c:if test="${not empty sessionKey}">
        <a class="nav-item logout-link" href="${pageContext.request.contextPath}/logout?key=${sessionKey}">Logout</a>
    </c:if>
</nav>

<section>
    <div class="category" id="seeds">
        <h2>🌿 Seeds</h2>
        <ul>
            <li>Vegetable Seeds - AgroGrow, GreenField, OrganicLife</li>
            <li>Flower Seeds - BloomCo, NatureSprout</li>
            <li>Herb Seeds - FreshHerbs, FarmPick</li>
        </ul>
    </div>

    <div class="category" id="cutting">
        <h2>✂ Cutting Tools</h2>
        <ul>
            <li>Garden Scissors - TrimPro, SharpEdge</li>
            <li>Pruners & Secateurs - EasyCut, Gardena</li>
            <li>Hedge Trimmers - GreenBlade, Husqvarna</li>
        </ul>
    </div>

    <div class="category" id="watering">
        <h2>💧 Watering Equipment</h2>
        <ul>
            <li>Watering Cans - AquaCan, EcoFlow</li>
            <li>Garden Hoses & Pipes - RainDrop, FlowMax</li>
            <li>Sprinklers - MistyGarden, RainBird</li>
        </ul>
    </div>

    <div class="category" id="fertilisers">
        <h2>🌾 Fertilisers & Soil</h2>
        <ul>
            <li>Organic Fertiliser - BioGrow, GreenEarth</li>
            <li>Compost & Manure - PureSoil, AgroCare</li>
            <li>Pesticides - SafeGrow, CropGuard</li>
        </ul>
    </div>

    <div class="category" id="planters">
        <h2>🪴 Pots & Planters</h2>
        <ul>
            <li>Clay Pots - PotteryWorld, EarthCraft</li>
            <li>Plastic Planters - GreenPot, PolyGrow</li>
            <li>Decorative Planters - UrbanGarden, StyleDecor</li>
        </ul>
    </div>

    <div class="category" id="accessories">
        <h2>🌻 Gardening Accessories</h2>
        <ul>
            <li>Gloves & Aprons - SafeHands, GardenWear</li>
            <li>Garden Kits - EasyGarden, PlantMaster</li>
            <li>Mini Greenhouses - EcoDome, NatureCare</li>
        </ul>
    </div>
</section>

<footer>
    <p>© 2025 Plantify Nursery | Designed for APC Project</p>
    <p>Owner: Ms Mahak Choudhary</p>
    <p>Email: plantify@gmail.com | Phone: +91 9876543210</p>
</footer>

</body>
</html>