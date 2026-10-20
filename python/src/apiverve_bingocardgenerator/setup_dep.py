from setuptools import setup, find_packages

setup(
    name='apiverve_bingocardgenerator',
    version='1.2.2',
    packages=find_packages(),
    include_package_data=True,
    install_requires=[
        'requests',
        'setuptools'
    ],
    description='Bingo Card Generator is a bingo API that creates customizable bingo cards with random numbers as JSON, with HTML rendering and downloadable PNG images on paid plans.',
    author='APIVerve',
    author_email='hello@apiverve.com',
    url='https://apiverve.com/marketplace/bingocardgenerator?utm_source=pypi&utm_medium=referral&utm_content=homepage',
    classifiers=[
        'Programming Language :: Python :: 3',
        'Operating System :: OS Independent',
    ],
    python_requires='>=3.6',
)
